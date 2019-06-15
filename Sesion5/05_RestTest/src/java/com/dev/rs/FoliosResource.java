/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.rs;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author g_ric
 */
@Path("folios")
public class FoliosResource {

    private static List<Ticket> lista = new ArrayList<>();
    
    static
    {
        Evento e = new Evento(1, "Los Caligaris", "Ska", "02/10/2019");
        Ticket t = new Ticket(1, "gericoc", "Palacio de los Deportes", 500.00, e);
        lista.add(t);
        
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllTickets() {
        if (lista.isEmpty()) {
            LOG.log(Level.SEVERE, "No hay Registros!");
            return Response.status(501).build();
        } else {

            return Response.ok().entity(lista).build();
        }
    }

    @GET
    @Path("{id}")
    public Response getTicketById(@PathParam("id") long id) {
        for (Ticket t : lista) {
            if (t.getId() == id) {
                return Response.ok(t).build();
            }
        }
        return Response.serverError().build();
    }

    /**
     *
     * @param ticket
     * @return JSON WITH TICKET INFO
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addTicket(Ticket ticket) {
        try {
            
            ticket.setId(Math.abs(UUID.randomUUID().getMostSignificantBits()));
            Evento e = ticket.getEvento();
            e.setClave(Math.abs(UUID.randomUUID().getMostSignificantBits()));
            lista.add(ticket);
            return Response.ok().entity(ticket).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    private static final Logger LOG = Logger.getLogger(FoliosResource.class.getName());
}
