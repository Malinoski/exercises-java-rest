package malinoski.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
  
@Path("/hello-you")
public class HelloYou {
  
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
  
        String output = "Welcome   : " + name;
  
        return Response.status(200).entity(output).build();
  
    }
  
}