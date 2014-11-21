package com.codebolt.restskeleton;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.codebolt.restskeleton.rest.HelloWorldService;

/**
 * The main application class which runs the application and ties the Dropwizard libraries together.
 * 
 * More info: https://dropwizard.github.io/dropwizard/getting-started.html
 * 
 * @author Rune
 *
 */
public class RestApp extends Application<Configuration> {
	
	@Override
	public String getName() {
		return "rest-skeleton-app" ;
	}

	@Override
	public void initialize(Bootstrap<Configuration> arg0) { 
		// nothing to initialize
	}

	@Override
	public void run(Configuration config, Environment environment)
			throws Exception {
		// register rest service classes here
		environment.jersey().register(HelloWorldService.class);
	}
	
	public static void main(String[] args) throws Exception {
		new RestApp().run(args);
	}

}
