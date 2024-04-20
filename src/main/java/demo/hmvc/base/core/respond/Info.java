package demo.hmvc.base.core.respond;

import java.io.Serializable;

public class Info implements Serializable {
		
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2239251454069512339L;
	private int desplazamiento;
	private int limite;
	private long total;
	
	
	public int getDesplazamiento() {
		return desplazamiento;
	}
	public void setDesplazamiento(int desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	public Info(int desplazamiento, int limite, long total) {
		super();
		this.desplazamiento = desplazamiento;
		this.limite = limite;
		this.total = total;
	}
	
	
}
