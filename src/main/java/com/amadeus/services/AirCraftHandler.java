package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public class AirCraftHandler implements AirService{
	String response="";
	@Override
	public String getAllAirServices(String operatedBy,String id) {
		if(!(operatedBy.equals(null) && id.equals(null))) {
		
		if(("QF".equals(operatedBy) || "JQ".equals(operatedBy)) && id.startsWith("VH") ) {
			response=response + "aircraft operated by carriers QF or JQ .  ";
			response=response + "aircraft ID is starting with \"VH\"";
		}
		}else {
			response=response + "Please provide proper value for  operatedBy and ID ";
		}
		
			
		
		return response;
	}

	@Override
	public String getAllAirServiceConfigurations(String serviceConfigurationId) {
		if(!serviceConfigurationId.equals(null)) {
			response=response+"ServiceConfigurationId for Aircraft " + serviceConfigurationId;
			
		}
		return response;
	}
 
	
}
