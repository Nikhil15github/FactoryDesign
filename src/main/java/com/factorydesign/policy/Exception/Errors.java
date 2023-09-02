package com.factorydesign.policy.Exception;

public enum Errors 
{

	DATA_NOT_FOUND("001","Enter Valid Policy");
	
	private String code;
	private String message;
	
	Errors(String code,String message)
	{
		this.code=code;
		this.message=message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	
	
	
}
