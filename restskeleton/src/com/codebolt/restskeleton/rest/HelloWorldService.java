package com.codebolt.restskeleton.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Et par helt enkle REST WS'er.
 * 
 * @author Rune
 *
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldService {

	@GET
	@Path("/world")
	public String helloWorld() {
		return "Hello, World!" ;
	}
	
	@GET
	@Path("/name/{name}")
	public String helloName(@PathParam("name") String name) {
		return "Hello, " + name + "!" ;
	}
}
