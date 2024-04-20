/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.hmvc.base.modules.demo.service.impl;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import demo.hmvc.base.modules.demo.entity.DemoEtity;
import demo.hmvc.base.modules.demo.model.DemoModel;
import demo.hmvc.base.modules.demo.service.DemoModelRepository;


/**
 *
 * @author gabri
 */
@Service("DemoService")
@Component
@Transactional
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    @Autowired
    @Qualifier("DemoModelRepository")
    DemoModelRepository repositorio;
    
    

    public List<DemoModel>  getListDemo() {
        try {

        	
            List<DemoEtity> databd = repositorio.findAll();
            
            List<DemoModel> dataOutput = new ArrayList<DemoModel>();
            
            for (DemoEtity demoModel : databd) {
            	
            	DemoModel dataPivot = new DemoModel();
            	
            	dataPivot.setDemoname(demoModel.getDemoname());
            	dataPivot.setDemocapital(demoModel.getDemocapital());
            	dataPivot.setIddemo(demoModel.getIddemo());
            	dataOutput.add(dataPivot); 
            	
			}

            return dataOutput;
        } catch (Exception e) {
        	logger.error("No fue posible consultar la data solicitada",e);
            return null;
        }

    }


	public boolean setDemoModel(DemoModel demoModel) {

        DemoEtity databd = new DemoEtity();
        databd.setDemocapital(demoModel.getDemocapital());
        databd.setDemoname(demoModel.getDemoname());
        
        
        DemoEtity dataSaved= repositorio.save(databd); 
        
        if (dataSaved.getIddemo()!=null) {
        	return true;
		} else {
			return false;
		}

		
	}
	

}
