 
package demo.hmvc.base.modules.demo.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import demo.hmvc.base.core.exceptions.NoDataException;
import demo.hmvc.base.modules.demo.entity.DemoEtity;
import demo.hmvc.base.modules.demo.model.DemoModel;
import demo.hmvc.base.modules.demo.service.impl.DemoService;
import net.minidev.json.annotate.JsonIgnore;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gabri
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	@Qualifier("DemoService")
	private DemoService servicio;
	
	@GetMapping(path = "demoInnerGet")	
	public ResponseEntity<?> getAllProfiles(HttpServletRequest request, HttpServletResponse response) {
		List<DemoModel>  result = servicio.getListDemo();

		if (!result.isEmpty()) {
			return ResponseEntity.ok().body(result);
		} else {
			throw new NoDataException("perfiles - No hay valores asoaciodos a la consulta");
		}
	}
	
	@PostMapping(path = "/demoInnerPost")	
	public ResponseEntity<?> setProfile(
			@RequestBody DemoModel demoModel,
			HttpServletRequest request, 
			
			HttpServletResponse response) {

		boolean  result = servicio.setDemoModel(demoModel);

		if (result) {
			return ResponseEntity.ok().body(result);
		} else {
			throw new NoDataException("perfiles - No es posible registrar este perfil");
		}
	}


}
