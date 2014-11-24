# restskeleton

A simple REST-service skeleton application based on Dropwizard.

## Running with Eclipse (quick guide)

* Download and install Java 8 JDK. 
* Download the latest Eclipse.
* In Eclipse, install the [m2eclipse](http://eclipse.org/m2e/) and [EGit](http://eclipse.org/egit/) plugins.
* Check out this project to your Eclipse workspace using EGit.
* If it's not automatically recognized as a Maven project in Eclipse, you have to right click the project and select Configure->Convert to Maven project
* Launch this project as a Java Application, using com.codebolt.restskeleton.RestApp as your main class.
* Go to http://localhost:8080/hello/world to test call the REST service in your browser. This one just returns a simple string with no input.
* Also try http://localhost:8080/hello/add/100/200 to see the other example service in action. This one returns a proper JSON object, which is automatically deserialized (/generated) from the Java class Addition in the application.
