package com.factorydesign.policy.service;

public class TermPolicy implements Policy{

	private static final String termPolicy="This is term policy";
	
	@Override
	public String getPolicy() {
		
		return termPolicy;
	}

}
