package org.technojays.first.service.h4;

import com.google.inject.Inject;
import org.technojays.first.dao.TeamDAO;
import org.technojays.first.jooq.tables.pojos.Team;
import org.technojays.first.service.TeamService;

import java.util.List;

/**
 * @author Derelle.Redmond
 * @since 2/5/2015.
 * @deprecated
 * <p/>
 * Team Service for Hibernate 4
 */
public class H4TeamService implements TeamService {

    @Inject
    TeamDAO teamDAO;

    @Override
    public Team getById(Long id) {
        return teamDAO.find(id);
    }

    @Override
    public Team getTeamByTeamNumber(Long teamNum) {
        return teamDAO.getByTeamNumber(teamNum);
    }

    @Override
    public List<Team> getTeams() {
        return teamDAO.findAll();
    }

    @Override
    public Team saveTeam(Team team) {
        teamDAO.save(team);
        return team;
    }
}
