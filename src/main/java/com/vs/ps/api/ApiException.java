package com.vs.ps.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
public class ApiException extends Exception {
	private int code;

	public ApiException(int code, String msg) {
		super(msg);
		this.code = code;
	}
}
