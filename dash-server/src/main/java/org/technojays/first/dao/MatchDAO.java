package org.technojays.first.dao;

import org.technojays.first.model.Event;
import org.technojays.first.model.Match;
import org.technojays.first.model.MatchType;
import org.technojays.first.model.metamodel.Match_;

import javax.persistence.criteria.Predicate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author Derelle.Redmond
 * @since 2/9/2015.
 *
 * Data Access Object for Match Entities
 */
public class MatchDAO extends AbstractDAO<Match> {


    public MatchDAO() {
        super(Match.class);
    }

    /**
     * Retrieve match by match number
     *
     * @param matchNum Match number to find
     * @return Match associated with the given match number
     */
    public Match getByMatchNumber(Long matchNum) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate matchNumCondition = qc.getCriteriaBuilder().equal(qc.getRoot().get(Match_.matchNum), matchNum);
        qc.getCriteriaQuery().where(matchNumCondition);

        return getSingleResult(qc.getCriteriaQuery());

//        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
//        CriteriaQuery<Match> criteria = builder.createQuery(Match.class);
//        Root<Match> matchRoot = criteria.from(Match.class);
//        criteria.select(matchRoot);
//        criteria.where(builder.equal(matchRoot.get(Match_.matchNum), matchNum));
//        return entityManager.createQuery(criteria).getSingleResult();
    }

    /**
     * Retrieve matches occurring after start date
     *
     * @param startDateTime DateTime to find matches after
     * @return List of matches starting after the date
     */
    public List<Match> getMatchesAfterDate(ZonedDateTime startDateTime) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate startCondition = qc.getCriteriaBuilder().greaterThanOrEqualTo(qc.getRoot().get(Match_.start), startDateTime);
        qc.getCriteriaQuery().where(startCondition);

        return getResultList(qc.getCriteriaQuery());
    }

    /**
     * Retrieve matches occurring between start and end DateTime provided
     *
     * @param fromDate Start of date time range
     * @param endDate End of date time range
     * @return List of matches in range
     */
    public List<Match> getMatchesBetweenDate(ZonedDateTime fromDate, ZonedDateTime endDate) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate rangeCondition = qc.getCriteriaBuilder().between(qc.getRoot().get(Match_.start), fromDate, endDate);
        qc.getCriteriaQuery().where(rangeCondition);

        return getResultList(qc.getCriteriaQuery());
    }

    /**
     * Retrieve matches for the given event
     *
     * @param event Event to find matches for
     * @return List of matches for event
     */
    public List<Match> getMatchesForEvent(Event event) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate eventCondition = qc.getCriteriaBuilder().equal(qc.getRoot().get(Match_.event), event);
        qc.getCriteriaQuery().where(eventCondition);

        return getResultList(qc.getCriteriaQuery());
    }

    /**
     * Retrieve matches by type
     *
     * @param type Match type for find
     * @return List of matches for match type
     */
    public List<Match> getMatchesByType(MatchType type) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate typeCondition = qc.getCriteriaBuilder().equal(qc.getRoot().get(Match_.type), type);
        qc.getCriteriaQuery().where(typeCondition);

        return getResultList(qc.getCriteriaQuery());
    }

    /**
     * Retrieve matches by type and event
     *
     * @param event Event of matches
     * @param type Type of event
     * @return List of matches for event and type
     */
    public List<Match> getMatchesByEventAndType(Event event, MatchType type) {
        QueryContainer<Match> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate typeCondition = qc.getCriteriaBuilder().equal(qc.getRoot().get(Match_.type), type);
        Predicate eventCondition = qc.getCriteriaBuilder().equal(qc.getRoot().get(Match_.event), event);
        qc.getCriteriaQuery().where(qc.getCriteriaBuilder().and(eventCondition, typeCondition));

        return getResultList(qc.getCriteriaQuery());
    }

}
