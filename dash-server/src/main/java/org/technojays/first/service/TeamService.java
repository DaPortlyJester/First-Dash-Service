package org.technojays.first.service;


import org.technojays.first.jooq.tables.pojos.Team;

import java.util.List;

/**
 * Created by DaPortlyJester
 *
 * @since 1/17/2015.
 * <p/>
 * Service interface to retrieve Team information
 */
public interface TeamService {

    /**
     * Get team by id
     *
     * @param id System id of the team
     * @return Team with given id, null if team does not exist
     */
    Team getById(Long id);

    /**
     * Get team and info
     * @param id
     * @return
     */
    Team getTeamAndInfoById(Long id);

    /**
     * Get team by FIRST team number
     *
     * @param teamNum Team number to find by
     * @return Team that has this team number, null if team does not exist
     */
    Team getByTeamNumber(Long teamNum);

    /**
     * Get list of all teams
     *
     * @return List of all teams
     */
    List<Team> getTeams();

    /**
     * Save team
     *
     * @param team
     * @return
     */
    Team save(Team team);

    /**
     * Delete team by id
     *
     * @return true if successful, false otherwise
     */
    boolean deleteTeamById(Long id);

    /**
     * Delete team
     *
     * @return true if successful, false otherwise
     */
    boolean deleteTeam(Team team);

}
