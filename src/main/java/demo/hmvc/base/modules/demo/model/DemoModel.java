/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.hmvc.base.modules.demo.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 *
 * @author gabri
 */
@Data
public class DemoModel implements Serializable{
    
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    private Integer iddemo;
    private String demoname;
    private String democapital;


}
