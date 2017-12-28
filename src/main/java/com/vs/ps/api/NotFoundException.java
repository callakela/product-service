package com.vs.ps.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
public class NotFoundException extends ApiException {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int code;

	public NotFoundException(int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
