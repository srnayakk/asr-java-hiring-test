package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public class AirPortHandler implements AirService{
	
	String response="";

	@Override
	public String getAllAirServices(String operatedBy,String id) {
		response=response + "Airport OperatedBy " + operatedBy;
		response=response + "Airport ID " + id;
		return response;
	}

	@Override
	public String getAllAirServiceConfigurations(String serviceConfigurationId) {
		response=response + "Airport ServiceConfigurationID " + serviceConfigurationId;
		return response;
	}

}
