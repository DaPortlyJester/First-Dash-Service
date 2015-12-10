package org.technojays.first.service.jooq;

import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.technojays.first.inject.ConfigurationInjection;
import org.technojays.first.inject.JooqInjection;
import org.technojays.first.jooq.tables.daos.TeamDao;
import org.technojays.first.jooq.tables.pojos.Team;
import org.technojays.first.service.TeamService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Derelle.Redmond
 * @since 12/8/2015
 */
@RunWith(JukitoRunner.class)
public class JQTeamServiceTest {

    @Inject
    TeamService teamService;

    @Mock
    TeamDao teamDao;

    @Test
    @UseModules({ConfigurationInjection.class, JooqInjection.class})
    public void testGetById(TeamService teamService) throws Exception {
        Team team = buildTeam(101);
        Team t1 = teamService.getById(team.getId().longValue());
        assertFalse("Built team is not retrieved", team.equals(t1));
        assertTrue("Team does not exist", t1 == null);
        teamService.save(team);
        t1 = teamService.getById(team.getId().longValue());
        assertTrue("Retrieved team is equal to saved team", t1.equals(team));
        teamService.deleteTeam(team);
        assertTrue(teamService.getById(team.getId().longValue()) == null);
    }

    @Test
    @UseModules({ConfigurationInjection.class, JooqInjection.class})
    public void testGetTeamByTeamNumber(TeamService teamService) throws Exception {
        Team team = buildTeam(201);
        Team t1 = teamService.getByTeamNumber(team.getId().longValue());
        assertFalse("Built team is not retrieved", team.equals(t1));
        assertTrue("Team does not exist", t1 == null);
        teamService.save(team);
        t1 = teamService.getByTeamNumber(team.getId().longValue());
        assertTrue("Retrieved team is equal to saved team", t1.equals(team));
        teamService.deleteTeam(team);
        assertTrue(teamService.getById(team.getId().longValue()) == null);
    }

    @Test
    @UseModules({ConfigurationInjection.class, JooqInjection.class})
    public void testGetTeams(TeamService teamService) throws Exception {
        List<Team> teamList = buildTeams();
        List<Team> t1List = teamService.getTeams();
        // assertFalse("Teams are not retrieved", teamList.containsAll(t1List));
        assertTrue("Teams does not exist", t1List == null || t1List.isEmpty());
        teamList.forEach((team -> teamService.save(team)));
        t1List = teamService.getTeams();
        assertTrue("Retrieved team list contains all built teams", t1List.containsAll(teamList));
        teamList.forEach((team -> teamService.deleteTeam(team)));
        teamList.forEach((team -> assertTrue(teamService.getById(team.getId().longValue()) == null)));
    }

    @Test
    @UseModules({ConfigurationInjection.class, JooqInjection.class})
    public void testSaveTeam(TeamService teamService) throws Exception {
        Team team = buildTeam(301);
        Team t1 = teamService.getById(team.getId().longValue());
        assertFalse("Built team is not retrieved", team.equals(t1));
        assertTrue("Team does not exist", t1 == null);
        teamService.save(team);
        t1 = teamService.getById(team.getId().longValue());
        assertTrue("Retrieved team is equal to saved team", t1.equals(team));
        teamService.deleteTeam(team);
        assertTrue(teamService.getById(team.getId().longValue()) == null);
    }

    Team buildTeam(int num) {
        Team team = new Team();
        team.setId(num)
                .setName("Test" + num)
                .setNumber(num)
                .setProgramId(num)
                .setShortName("TST" + num);
        return team;
    }

    List<Team> buildTeams() {
        return IntStream.range(0, 100).mapToObj(i -> buildTeam(i)).collect(toList());
    }
}