package com.amadeus.service.inject;

import com.amadeus.services.AirCraftHandler;
import com.amadeus.services.AirPortHandler;
import com.amadeus.services.AirService;
import com.google.inject.AbstractModule;

public class AirServiceInjector extends AbstractModule{

	String serviceType;
	
	public AirServiceInjector() {}
	public AirServiceInjector(String serviceType) {
		super();
		this.serviceType = serviceType;
		//configure();
	}


	@Override
	protected void configure() {
		if(serviceType.equals("airCraft")) {
			bind(AirService.class).to(AirCraftHandler.class);
		}
		else {
			bind(AirService.class).to(AirPortHandler.class);
		}
		
	}

}
