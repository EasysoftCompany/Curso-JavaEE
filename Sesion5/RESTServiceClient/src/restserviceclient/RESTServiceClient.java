package restserviceclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author g_ric
 */
public class RESTServiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/RESTService/api/hello/Gerardo/Rico");
        
        Invocation.Builder builder = target.request(MediaType.TEXT_PLAIN_TYPE);
        
        System.out.println(builder.get().readEntity(String.class));
        
    }
    
}
