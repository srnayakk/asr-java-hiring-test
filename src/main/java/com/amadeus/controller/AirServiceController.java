package com.amadeus.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.amadeus.consume.AirServiceConsumer;
import com.amadeus.service.inject.AirServiceInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;
@Path("/air")

public class AirServiceController {
	
	public AirServiceController() {

	}
	@GET
	@Path("/serviceType/{serviceType}/opName/{opName}/operatedBy/{operatedBy}/id/{id}/serviceConfigurationId/{serviceConfigurationId}")
	//@Produces("application/xml")
	public Response processService(@PathParam("serviceType") String serviceType,@PathParam("opName") String opName,@PathParam("operatedBy") String operatedBy,@PathParam("id") String id,@PathParam("serviceConfigurationId") String serviceConfigurationId) {
		System.out.println(serviceType+"========"+opName+"=========="+operatedBy+"==========="+id+ "============"+ serviceConfigurationId);
		Injector injector = Guice.createInjector(new AirServiceInjector(serviceType));		
		AirServiceConsumer app = injector.getInstance(AirServiceConsumer.class);
		
		if(opName.equals("getAllAirServices")) {
			app.consumeGetAllService(operatedBy,id);
		}
		else if(opName.equals("getAllAirServiceConfigurations")) {
			app.consumeGetAirConfiguration(serviceConfigurationId);;
		}
		
		return Response.status(200).entity("everything").build();
	}

	
}
