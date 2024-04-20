package demo.hmvc.base.core.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NoDataException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 8613384983095563000L;
	
	public NoDataException(String msg) {
		super(msg);
	}

	public NoDataException(String msg, Throwable t) {
		super(msg, t);
	}
	

}
