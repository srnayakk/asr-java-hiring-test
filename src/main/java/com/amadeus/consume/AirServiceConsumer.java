package com.amadeus.consume;

import com.amadeus.services.AirService;
import com.google.inject.Inject;

public class AirServiceConsumer {
	private AirService service;
	@Inject
	public AirServiceConsumer(AirService service) {
		super();
		this.service = service;
	}
	 
	public String consumeGetAllService(String operatedBy,String id) {
		return service.getAllAirServices(operatedBy,id);
	}
	public String  consumeGetAirConfiguration(String serviceConfigurationId) {
		return service.getAllAirServiceConfigurations(serviceConfigurationId);
	}

}
