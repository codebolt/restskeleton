package com.codebolt.restskeleton;

import com.codebolt.restskeleton.rest.HelloWorldService;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * The main application class which runs the application and ties the Dropwizard libraries together.
 * 
 * More info: https://dropwizard.github.io/dropwizard/getting-started.html
 * 
 * @author Rune
 *
 */
public class RestApp extends Application<RestAppConfiguration> {
	
	@Override
	public String getName() {
		return "rest-skeleton-app" ;
	}

	@Override
	public void initialize(Bootstrap<RestAppConfiguration> arg0) { 
		// nothing to initialize
	}

	@Override
	public void run(RestAppConfiguration config, Environment environment)
			throws Exception {
		// register rest service classes here
		environment.jersey().register(HelloWorldService.class);
	}
	
	public static void main(String[] args) throws Exception {
		new RestApp().run(args);
	}

}
