package demo.hmvc.base.core.respond;

import java.io.Serializable;

public class Result implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3908663532428001111L;
	private String Codigo;
	private String Mensaje;
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public Result(String codigo, String mensaje) {
		super();
		Codigo = codigo;
		Mensaje = mensaje;
	}
	
	public Result() {
		super();
	}
	
	
	
	
}
