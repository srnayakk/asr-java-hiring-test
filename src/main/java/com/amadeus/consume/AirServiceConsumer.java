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
	 
	public void consumeGetAllService(String operatedBy,String id) {
		service.getAllAirServices(operatedBy,id);
	}
	public void consumeGetAirConfiguration(String serviceConfigurationId) {
		service.getAllAirServiceConfigurations(serviceConfigurationId);
	}

}
