package model.exceptions;

public class BusinessAccountException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BusinessAccountException(String msg) {
		   super(msg);
	}
}
