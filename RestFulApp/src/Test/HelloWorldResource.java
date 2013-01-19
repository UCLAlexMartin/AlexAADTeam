package Test;
import javax.ws.rs.*;

@Path("/hello")
public class HelloWorldResource {

	@GET
	@Produces("text/plain")
	public String getHelloWorld(){
		return "Hello world";
	}

}
