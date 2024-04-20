package demo.hmvc.base.core.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NoModifyException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6222855744340275078L;
	
	public NoModifyException(String msg) {
		super(msg);
	}

	public NoModifyException(String msg, Throwable t) {
		super(msg, t);
	}
	
}
