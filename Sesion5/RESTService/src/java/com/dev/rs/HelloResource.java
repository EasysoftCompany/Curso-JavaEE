package com.dev.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author g_ric
 */
@Path("hello")
public class HelloResource {

    /**
     *
     * @param name
     * @param ap
     * @return
     */
    @GET
    @Path("{name}/{ap}") //Importante anotar el @Path con {} Para que lo parsee con @PathParam    
    public Response sayHello(@PathParam("name") String name, @PathParam("ap") String ap) {
        return Response.status(200).entity("Hola, " + name + " " + ap + "!").build();
    }
}
