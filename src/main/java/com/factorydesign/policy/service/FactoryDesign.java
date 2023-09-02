package com.factorydesign.policy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.factorydesign.policy.Exception.Errors;
import com.factorydesign.policy.Exception.ResourceNotFoundException;

@Service
public class FactoryDesign 
{
	private static final Logger LOG= LoggerFactory.getLogger(FactoryDesign.class);

	public Policy getPolicyDetails(String input)
	{
	LOG.info("Entered in class");
		
		try
		{
		if("Term".equalsIgnoreCase(input))
		{
			LOG.info("Term Policy called");
			return new TermPolicy();
		}
		else 
			if("Bike".equalsIgnoreCase(input))
			{
				LOG.info("Bike Policy called");
				return new BikePolicy();
			}
			else
				if("Car".equalsIgnoreCase(input))
				{
					LOG.info("Car Policy called");
					return new CarPolicy();
				}
				else
				{
					throw new ResourceNotFoundException(Errors.DATA_NOT_FOUND.getCode(),Errors.DATA_NOT_FOUND.getMessage());
				}
		}
		catch(Exception e)
		{
			
			LOG.info(e.getMessage());
		}
		
		  return null; 
	}
}
