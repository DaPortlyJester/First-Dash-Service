package org.technojays.first.rest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.technojays.first.exception.DashException;
import org.technojays.first.jooq.tables.pojos.Team;
import org.technojays.first.service.TeamService;
import org.technojays.first.util.FDC;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

/**
 * @author DaPortlyJester
 * @since 1/19/2015
 * <p/>
 * REST endpoint for retrieving team information
 */
@Path("team")
@Slf4j
public class TeamResource extends DashResource {
    public static final String RESOURCE_NAME = "team";

    private TeamService teamService;

    @Context
    UriInfo uriInfo;

    @Inject
    public TeamResource(TeamService teamService) {
        this.teamService = teamService;
    }

    /**
     * Get team by FIRST Dash Id
     *
     * @param teamNumParam Id of the team
     * @return Team associated with given system id number
     * @throws DashException
     */
    @GET
    @Path("/{teamNum}")
    @Produces(MediaType.APPLICATION_JSON)
    public Team getTeam(@PathParam("teamNum") String teamNumParam) throws DashException {
        log.debug("Getting team by teamNumber {}", teamNumParam);
        Long teamNum = getLongFromParameter(teamNumParam);
        return teamService.getByTeamNumber(teamNum);
    }

    /**
     * Get all teams
     *
     * @return All known teams
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Team> getTeams() {
        log.debug("Getting full list of teams");
        List<Team> teams = teamService.getTeams();
        if(teams == null || teams.isEmpty()) {
            return null;
        }
        return teams;
    }

    /**
     * Get team by FIRST Dash id number
     *
     * @param idParam Number associated with the team by FIRST
     * @return Team associated with team number
     * @throws DashException
     */
    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Team getTeamByTeamNumber(@PathParam("id") String idParam) throws DashException {
        log.debug("Getting team by id {}", idParam);
        Long id = getLongFromParameter(idParam);
        return teamService.getById(id);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveTeam(Team team) {
        Team newTeam = teamService.save(team);
        URI teamURI = uriInfo.getAbsolutePathBuilder().path(newTeam.getId().toString()).build();
        return Response.created(teamURI).entity(newTeam).build();
    }
}
