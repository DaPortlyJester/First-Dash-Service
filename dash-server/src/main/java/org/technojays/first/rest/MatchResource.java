package org.technojays.first.rest;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.technojays.first.model.Match;
import org.technojays.first.service.MatchService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author DaPortlyJester
 * @since 1/19/2015
 * Rest endpoint for retrieving match information
 */
@Path("match")
public class MatchResource extends DashResource {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private MatchService matchService;

    @Inject
    public MatchResource(MatchService matchService) {
        this.matchService = matchService;
    }

    /**
     * Get match by FIRST Dash Id
     *
     * @param id System id of match
     * @return Match associated with system id number
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Match getMatch(@PathParam("id") String id) {
        return new Match();
    }

    /**
     * Get match by match number
     *
     * @param matchNumber FIRST event match number
     * @return Match associated with match number
     */
    @GET
    @Path("/number/{matchNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Match getMatchByMatchNumber(@PathParam("matchNumber") String matchNumber) {
        return new Match();
    }
}
