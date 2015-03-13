package org.technojays.first.dao;

import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.technojays.first.inject.ConfigurationInjection;
import org.technojays.first.inject.DashGuiceH4Module;
import org.technojays.first.model.Team;

import static org.junit.Assert.*;

@RunWith(JukitoRunner.class)
public class TeamDAOTest {

    @Test
    @UseModules({ConfigurationInjection.class, DashGuiceH4Module.class})
    public void testGetByTeamNumber(TeamDAO teamDAO) throws Exception {
        long testTeamNum = 50L;
        Team team = teamDAO.getByTeamNumber(testTeamNum);
        assertNull(team);
        Team testTeam = buildTestTeam(testTeamNum);
        teamDAO.save(testTeam);
        teamDAO.getByTeamNumber(testTeamNum);
        assertNotNull(testTeam);
    }

    @Test
    public void testGetByTeamName() throws Exception {

    }

    @Test
    public void testGetByShortName() throws Exception {

    }

    private Team buildTestTeam(Long teamNum){
        Team team = new Team();
        team.setName("Test Team " + teamNum);
        team.setShortName("TT " + teamNum);
        team.setTeamNum(teamNum);
        return team;
    }
}