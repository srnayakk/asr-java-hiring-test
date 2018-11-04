package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public class AirCraftHandler implements AirService{

	@Override
	public Collection<String> getAllAirServices(String operatedBy,String id) {
		if(!(operatedBy.equals(null) && id.equals(null))) {
		
		if(("QF".equals(operatedBy) || "JQ".equals(operatedBy)) && id.startsWith("VH") ) {
			System.out.println("aircraft operated by carriers QF or JQ");
			System.out.println("aircraft ID is starting with \"VH\"");
		}
		}else {
			System.out.println("Please provide proper value for  operatedBy and ID ");
		}
		
			
		
		return null;
	}

	@Override
	public Optional<String> getAllAirServiceConfigurations(String serviceConfigurationId) {
		if(!serviceConfigurationId.equals(null)) {
			System.out.println("ServiceConfigurationId for Aircraft " + serviceConfigurationId);
			
		}
		return null;
	}
 
	
}
