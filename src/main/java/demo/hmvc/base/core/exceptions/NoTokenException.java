package demo.hmvc.base.core.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class NoTokenException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5991477546192554747L;
	
	public NoTokenException(String msg) {
		super(msg);
	}

	public NoTokenException(String msg, Throwable t) {
		super(msg, t);
	}
	
}
