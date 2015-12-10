package org.technojays.first.service.jooq;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class JQTeamService implements TeamService {

    private TeamDao teamDao;

    @Inject
    public JQTeamService(Configuration config) {
        teamDao = new TeamDao(config);
    }

    @Override
    public Team getById(Long id) {
        return teamDao.fetchOneById(id.intValue());
    }

    @Override
    public Team getTeamAndInfoById(Long id) {
        return null;
    }

    @Override
    public Team getByTeamNumber(Long teamNum) {
        return teamDao.fetchOne(Tables.TEAM.ID, teamNum.intValue());
    }

    @Override
    public List<Team> getTeams() {
        return teamDao.findAll();
    }

    @Override
    public boolean deleteTeamById(Long id) {
        teamDao.deleteById(id.intValue());
        return true;
    }

    @Override
    public boolean deleteTeam(Team team) {
        teamDao.deleteById(team.getId());
        return true;
    }

    @Override
    public Team save(Team team) {
        teamDao.insert(team);
        return teamDao.fetchOne(org.technojays.first.jooq.tables.Team.TEAM.NUMBER,team.getNumber());
    }
}
