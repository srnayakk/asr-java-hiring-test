package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public class AirPortHandler implements AirService{

	@Override
	public Collection<String> getAllAirServices(String operatedBy,String id) {
		
			System.out.println("Airport OperatedBy " + operatedBy);
			System.out.println("Airport ID " + id);
		return null;
	}

	@Override
	public Optional<String> getAllAirServiceConfigurations(String serviceConfigurationId) {
		System.out.println("Airport ServiceConfigurationID " + serviceConfigurationId);
		return null;
	}

}
