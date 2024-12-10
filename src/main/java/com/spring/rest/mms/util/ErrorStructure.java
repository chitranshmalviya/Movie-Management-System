package com.spring.rest.mms.util;

public class ErrorStructure {
	private int status;
	private String Message;
	private String rootCause;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public static ErrorStructure create(int status,String Message,String rootCause ) {
		ErrorStructure errorStructure = new ErrorStructure();
		errorStructure.setStatus(status);
		errorStructure.setMessage(Message);
		errorStructure.setRootCause(rootCause);
		return errorStructure;
	}
}
