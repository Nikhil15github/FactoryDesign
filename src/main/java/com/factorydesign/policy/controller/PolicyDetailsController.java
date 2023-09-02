package com.factorydesign.policy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factorydesign.policy.service.FactoryDesign;
import com.factorydesign.policy.service.Policy;

@RestController
@RequestMapping("/policy")
public class PolicyDetailsController 
{
	private static final Logger LOG= LoggerFactory.getLogger(PolicyDetailsController.class);
	@Autowired
	FactoryDesign factoryDesign;
	
	@GetMapping("/get/{input}")
	public ResponseEntity<Policy> getPolicy( @PathVariable String input)
	{
		LOG.info("Controller class excution started");
		
		Policy policyDetails = factoryDesign.getPolicyDetails(input);
		
		LOG.info("Controller class excution ended");
		
		return new ResponseEntity<Policy>(policyDetails,HttpStatus.OK);
	}
}
