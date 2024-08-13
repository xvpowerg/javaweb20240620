package tw.com.ws;



import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestful {
	@GET
	public String testHello() {
		return "{\"value\":\"Hello\"}";
	}
	
	
	@GET
	@Path("id")
	public String queryUserById(@QueryParam("myId") String id ) {
		return "{\"id\":\""+id+"\"}";
	}
	
}
