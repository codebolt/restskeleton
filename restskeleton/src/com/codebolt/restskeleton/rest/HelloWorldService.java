package com.codebolt.restskeleton.rest;

import javax.validation.constraints.NotNull;
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
	@Path("/add/{foo}/{bar}")
	public Addition addTwoNumbers(@PathParam("foo") @NotNull Long foo, @PathParam("bar") @NotNull Long bar) {
		return new Addition(foo, bar) ;
	}
}
