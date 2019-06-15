package com.dev.rs;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author g_ric
 */
@Path("orden")
public class OrdenResource {

    @POST
    @Path("{facturable}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response postOrden(@QueryParam("descripcion") String descripcion, @QueryParam("cantidad") int cantidad, @QueryParam("precio") double precio, @PathParam("facturable") boolean isFacturable) {
        try {

            Orden orden = new Orden();
            orden.setId(Math.abs(UUID.randomUUID().getMostSignificantBits()));

            orden.setDescripcion(descripcion);
            orden.setCantidad(cantidad);
            orden.setPrecio(precio);
            orden.setIsFacturable(isFacturable);

            return Response.ok().entity(orden).build();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, ex.toString());
            return Response.serverError().build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON) //SOLITO LO PARSEA A ORDEN!!! D=
    @Produces(MediaType.APPLICATION_JSON)
    public Response jsonOrden(Orden orden) {
        try {
            orden.setId(Math.abs(UUID.randomUUID().getMostSignificantBits()));
            return Response.ok().entity(orden).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    private static final Logger LOG = Logger.getLogger(OrdenResource.class.getName());
}
