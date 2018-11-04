package com.amadeus.services;

import java.util.Collection;
import java.util.Optional;

public interface AirService {

	public String getAllAirServices(String operatedBy,String id);
	public String getAllAirServiceConfigurations(String serviceConfigurationId);
}
