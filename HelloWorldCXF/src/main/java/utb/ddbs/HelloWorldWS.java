package utb.ddbs;

import javax.jws.WebMethod;
import javax.jws.WebParam; // Add this line!
import javax.jws.WebService;

@WebService
public class HelloWorldWS {
	@WebMethod
	public String sayHello() {
		return "This is my first web service in CXF";
	}
	
	@WebMethod
	public String greetUser(@WebParam(name="userName") String name) {
	    return "Hello, " + name + "! Welcome to your first CXF service.";
	}
}
