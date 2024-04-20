package demo.hmvc.adaptador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.hmvc.base.core.errors.Errors;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	public static final String DEFAULT_ERROR_VIEW = "Error Default";
	public static final String CODIGO_ERROR_GENERICO = "005";
	public static final String CODIGO_ERROR_NOTOKEN = "003";
	public static final String CODIGO_ERROR_AUTHORIZED = "002";
	public static final String CODIGO_ERROR_NODATA = "001";
	public static final String CODIGO_ERROR_NOMODIFICAR = "006";

	  @ExceptionHandler(value = Exception.class)	 
	  @ResponseBody Errors
	  handleExectRequest(HttpServletRequest req, HttpServletResponse response, Exception ex) {
		  System.out.println("handleExectRequest ");
		  ex.printStackTrace();
		  response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	      return new Errors(req.getServerName() + req.getServletPath(), CODIGO_ERROR_GENERICO, ex.getMessage(), ex.getLocalizedMessage()) ;
	  } 
	 
	  @ExceptionHandler(value = demo.hmvc.base.core.exceptions.NoDataException.class)
	  @ResponseBody Errors
	  handleBadRequest(HttpServletRequest req, HttpServletResponse response, Exception ex) {
		  System.out.println("handleBadRequest NoDataException ");
		  //ex.printStackTrace();
		  System.out.println("el error fue "+ex.getCause());
		  response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		  return new Errors(req.getServerName() + req.getServletPath(), CODIGO_ERROR_NODATA, ex.getMessage(), ex.getLocalizedMessage()) ;
	  } 	  
	
	  @ExceptionHandler(value = demo.hmvc.base.core.exceptions.FaulTokeAnauthorizedException.class)
	  @ResponseBody Errors
	  handleAuthRequest(HttpServletRequest req, HttpServletResponse response, Exception ex) {
		  System.out.println("handleBadRequest FaulTokeAnauthorizedException ");
		  ex.printStackTrace();
		  response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		  return new Errors(req.getServerName() + req.getServletPath(), CODIGO_ERROR_AUTHORIZED, ex.getMessage(), ex.getLocalizedMessage()) ;
	  } 
	  
	  @ExceptionHandler(value = demo.hmvc.base.core.exceptions.NoTokenException.class)
	  @ResponseBody Errors
	  handleTokenRequest(HttpServletRequest req, HttpServletResponse response, Exception ex) {
		  System.out.println("handleBadRequest NoTokenException  ");
		  ex.printStackTrace();
		  response.setStatus(422);
		  return new Errors(req.getServerName() + req.getServletPath(), CODIGO_ERROR_NOTOKEN, ex.getMessage(), ex.getLocalizedMessage()) ;
	  } 
	  
	  @ExceptionHandler(value = demo.hmvc.base.core.exceptions.NoModifyException.class)
	  @ResponseBody Errors
	  handleModifyRequest(HttpServletRequest req, HttpServletResponse response, Exception ex) {
		  System.out.println("handleBadRequest NoModifyException  ");
		  ex.printStackTrace();
		  response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		  return new Errors(req.getServerName() + req.getServletPath(), CODIGO_ERROR_NOMODIFICAR, ex.getMessage(), ex.getLocalizedMessage()) ;
	  } 
	  
}
