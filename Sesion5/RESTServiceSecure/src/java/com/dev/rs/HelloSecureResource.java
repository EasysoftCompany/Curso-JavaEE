/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Path("HelloSecure")
public class HelloSecureResource {

  @GET
  @Path("{name}")
  public Response sayHello(@PathParam("name") String name)
  {
      return Response.ok("Hello "+name).build();
  }
  
}
