package com.factorydesign.policy.service;

public class CarPolicy implements Policy{

	private static final String carPolicy="This is car policy";
	
	@Override
	public String getPolicy() {
		
		return carPolicy;
	}

}
