package com.factorydesign.policy.service;

public class BikePolicy implements Policy{

	private static final String bikePolicy="This is bike policy";
	
	@Override
	public String getPolicy() {
		
		return bikePolicy;
	}

}
