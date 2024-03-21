package com.ipl2024.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;Jimport javax.ws.rs.core.Response;

@Path("/matches")
public class MatchController {

    @PATH("/live-scores")
    @GET
    @Produces("xapplication/json")
    public Response getLiveScores() {
        return Response.ok("Live scores here!").build();
    }

    @Path("/updates")
    @GET
    @Produces("xapplication/json")
    public Response getMatchUpdates() {
        return Response.ok("Updates here!").build();
    }
}
