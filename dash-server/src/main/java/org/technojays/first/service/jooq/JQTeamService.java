package org.technojays.first.service.jooq;

import org.jooq.Configuration;
import org.technojays.first.jooq.Tables;
import org.technojays.first.jooq.tables.daos.TeamDao;
import org.technojays.first.jooq.tables.pojos.Team;
import org.technojays.first.service.TeamService;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Derelle.Redmond
 * @since 11/4/2015
 */
public class JQTeamService implements TeamService {

    private Configuration configuration;
    private TeamDao teamDao;

    @Inject
    public JQTeamService(Configuration config) {
        this.configuration = config;
        teamDao = new TeamDao(config);
    }

    @Override
    public Team getById(Long id) {
        return teamDao.fetchOneById(id.intValue());
    }

    @Override
    public Team getTeamByTeamNumber(Long teamNum) {
        return teamDao.fetchOne(Tables.TEAM.ID, teamNum.intValue());
    }

    @Override
    public List<Team> getTeams() {
        return teamDao.findAll();
    }

    @Override
    public Team saveTeam(Team team) {
        Team oldTeam = teamDao.fetchOneById(team.getId());
        teamDao.insert(team);
        return oldTeam;
    }
}
