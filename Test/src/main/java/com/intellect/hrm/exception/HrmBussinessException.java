package com.intellect.hrm.exception;

public class HrmBussinessException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message="";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HrmBussinessException() {
		super();
	}
	
	public HrmBussinessException(String message) {
		super(message);
		this.message=message;
	}
	
	public HrmBussinessException(Throwable message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return message;
		
	}
	
	
}