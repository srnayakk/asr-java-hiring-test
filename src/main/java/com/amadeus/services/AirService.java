package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public interface AirService {

	public Collection<String> getAllAirServices(String operatedBy,String id);
	public Optional<String> getAllAirServiceConfigurations(String serviceConfigurationId);
}
