package org.technojays.first.dao;

import com.google.inject.persist.PersistService;
import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.technojays.first.DashAppConfig;
import org.technojays.first.inject.ConfigurationInjection;
import org.technojays.first.inject.DashGuiceH4Module;
import org.technojays.first.inject.DashGuiceH4ServletModule;
import org.technojays.first.inject.PersistenceInit;
import org.technojays.first.model.Team;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(JukitoRunner.class)
// ConfigurationInjection.class,
public class TeamDAOTest {

   /**@Before
    @UseModules({DashGuiceH4ServletModule.class})
    public void setup(PersistService persistService){
        PersistenceInit persistenceInit = new PersistenceInit(persistService);
    }**/

    @Test
    @UseModules({DashGuiceH4ServletModule.class})
    public void testGetByTeamNumber(PersistService persistService, TeamDAO teamDAO) throws Exception {
        PersistenceInit persistenceInit = new PersistenceInit(persistService);
        long testTeamNum = 50L;
        Team team = teamDAO.getByTeamNumber(testTeamNum);
        assertNull(team);
        Team testTeam = buildTestTeam(testTeamNum);
        teamDAO.save(testTeam);
        team = teamDAO.getByTeamNumber(testTeamNum);
        assertNotNull(team);
        assertEquals(testTeam, team);
        teamDAO.remove(team.getId());
    }

    @Test
    @UseModules({DashGuiceH4ServletModule.class})
    public void testGetByTeamName(PersistService persistService, TeamDAO teamDAO) throws Exception {
        PersistenceInit persistenceInit = new PersistenceInit(persistService);
        long testTeamNum = 100l;
        String testTeamName = "TestName";
        Team testTeam = buildTestTeam(testTeamNum, testTeamName);
        List<Team> teams = teamDAO.getByTeamName(testTeamName);
        assertTrue(teams.isEmpty());
        teamDAO.save(testTeam);
        teams = teamDAO.getByTeamName(testTeam.getName());
        assertFalse(teams.isEmpty());
        for(Team t: teams) {
            assertEquals(testTeam, teams.get(0));
            teamDAO.remove(t);
        }
    }

    @Test
    @UseModules({DashGuiceH4ServletModule.class})
    public void testGetByShortName(PersistService persistService, TeamDAO teamDAO) throws Exception {
        PersistenceInit persistenceInit = new PersistenceInit(persistService);
        long testTeamNum = 25l;
        String testTeamName = "TestName";
        String testShortName = "Test Short Name";
        Team testTeam = buildTestTeam(testTeamNum, testTeamName, testShortName);
        List<Team> teams = teamDAO.getByShortName(testTeam.getShortName());
        assertTrue(teams.isEmpty());
        teamDAO.save(testTeam);
        teams = teamDAO.getByShortName(testTeam.getShortName());
        assertFalse(teams.isEmpty());
        for(Team t: teams) {
            assertEquals(testTeam, teams.get(0));
            teamDAO.remove(t);
        }
    }

    private Team buildTestTeam(long teamNum) {
        Team team = new Team();
        team.setName("Test Team " + teamNum);
        team.setShortName("TT " + teamNum);
        team.setTeamNum(teamNum);
        return team;
    }

    private Team buildTestTeam(long teamNum, String teamName) {
        Team team = new Team();
        team.setName(teamName + teamNum);
        team.setShortName("TT " + teamNum);
        team.setTeamNum(teamNum);
        return team;
    }

    private Team buildTestTeam(long teamNum, String teamName, String shortName) {
        Team team = new Team();
        team.setName(teamName + teamNum);
        team.setShortName("TT " + teamNum);
        team.setTeamNum(teamNum);
        return team;
    }
}