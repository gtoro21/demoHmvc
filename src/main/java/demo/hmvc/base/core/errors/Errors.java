package demo.hmvc.base.core.errors;

import java.io.Serializable;

public class Errors implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2880966710275279224L;
	
	final String CODIGO_SIN_DATO 		= "001"; 
	final String MENSAJE_SIN_DATO       = "No hay valores asoaciodos a la consulta";
	final String DESCRIPCION_SIN_DATO	= "not found";
	
	private String Ruta;
	private String Codigo;
	private String Mensaje;
	private String Descripcion;
	
	
	
	public String getRuta() {
		return Ruta;
	}
	public void setRuta(String ruta) {
		Ruta = ruta;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		this.Codigo = codigo;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		this.Mensaje = mensaje;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}
	
	
	
	public Errors(String ruta, String codigo, String mensaje, String descripcion) {
		super();
		Ruta = ruta;
		Codigo = codigo;
		Mensaje = mensaje;
		Descripcion = descripcion;
	}
	
	public Errors(String Descri) {		
		super();
		this.Codigo = CODIGO_SIN_DATO;
		this.Mensaje = MENSAJE_SIN_DATO;
		this.Descripcion = DESCRIPCION_SIN_DATO+" "+Descri;
	}
	
		
	@Override
	public String toString() { 
		return "{ \"Codigo\":\""+this.Codigo+"\" \"Mensaje\":\""+this.Mensaje+"\" \"Descripcion\":\""+this.Mensaje+"\" }";
	}	
	
	
		

}
