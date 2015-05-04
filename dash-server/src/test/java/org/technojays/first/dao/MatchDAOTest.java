package org.technojays.first.dao;

import com.google.inject.persist.PersistService;
import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.technojays.first.inject.ConfigurationInjection;
import org.technojays.first.inject.DashGuiceH4Module;
import org.technojays.first.inject.DashGuiceH4ServletModule;
import org.technojays.first.inject.PersistenceInit;
import org.technojays.first.model.*;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(JukitoRunner.class)
//@UseModules({ConfigurationInjection.class, DashGuiceH4Module.class})
public class MatchDAOTest {

    @Test
    @UseModules({DashGuiceH4ServletModule.class})
    public void testGetByMatchNumber(PersistService persistService, MatchDAO matchDAO) throws Exception {
        PersistenceInit persistenceInit = new PersistenceInit(persistService);
        long matchNum = 100l;
        Match testMatch = buildMatch();
        testMatch.setMatchNum(matchNum);
        List<Match> matches = matchDAO.getByMatchNumber(matchNum);
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
        matchDAO.save(testMatch);
        matches = matchDAO.getByMatchNumber(matchNum);
        for(Match m: matches) {
            assertEquals(m, testMatch);
        }
    }

    @Test
    public void testGetByMatchNumberAndEvent() throws Exception {

    }

    @Test
    public void testGetAfterDate() throws Exception {

    }

    @Test
    public void testGetBetweenDates() throws Exception {

    }

    @Test
    public void testGetForEvent() throws Exception {

    }

    @Test
    public void testGetByType() throws Exception {

    }

    @Test
    public void testGetByEventAndType() throws Exception {

    }

    @Test
    public void testGetByTeamAndEvent() throws Exception {

    }

    private Match buildMatch() {
        Match match = new Match();
        match.setMatchNum(10l);
        Game game = new Game();
        match.setGame(game);
        Event event = new Event();
        match.setStart(ZonedDateTime.now());
        match.setType(MatchType.QUALIFYING);
        Ally ally = new Ally();
        Set<Ally> allies = new HashSet<>();
        allies.add(ally);
        MatchScore matchScore = new MatchScore();
        matchScore.setMatch(match);
        matchScore.setScore(100l);
        matchScore.setType(ScoreType.TELEOP);
        Set<MatchScore> scores = new HashSet<>();
        scores.add(matchScore);

        return match;
    }
}