/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mehmet.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author mehmetpc
 */
@Path("/services")
public class GenericResource {

//    @Context
//    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
  
    /**
     * Retrieves representation of an instance of
     * com.mehmet.webservice.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
    	return "mehmet was here.. json";
    }

    @GET
    @Path("/test3/{key}/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsondsdsfsdfsdfsdf(@PathParam("key") String ke) {

        return "mehmet was here.. jsons"+ ke;
    }

    @GET
	@Path("customer/{pin}") //or /{pin}
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {

		Customer customer = new Customer();
		customer.setName("mehmet");
		customer.setPin(pin);

		return customer;

	}
    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
