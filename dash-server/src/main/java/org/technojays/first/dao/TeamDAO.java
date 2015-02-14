package org.technojays.first.dao;

import org.technojays.first.model.Team;
import org.technojays.first.model.metamodel.Team_;

import javax.persistence.criteria.Predicate;
import java.util.List;

/**
 * @author Derelle.Redmond
 * @since 2/5/2015.
 * <p/>
 * Data Access Object for Team Entities
 */
public class TeamDAO extends AbstractDAO<Team> {

    public TeamDAO() {
        super(Team.class);
    }

    /**
     * Retrieve team by team number
     *
     * @param teamNum Team number to find
     * @return Team associated with given team number
     */
    public Team getByTeamNumber(Long teamNum) {
        QueryContainer<Team> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate cond1 = qc.getCriteriaBuilder().equal(qc.getRoot().get(Team_.teamNum), teamNum);
        qc.getCriteriaQuery().where(cond1);

        return getSingleResult(qc.getCriteriaQuery());
    }

    /**
     * Retrieve team by team name
     *
     * @param teamName Team name to find
     * @return Teams associated with team name
     */
    public List<Team> getByName(String teamName) {
        QueryContainer<Team> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate cond1 = qc.getCriteriaBuilder().like(qc.getRoot().get(Team_.name), teamName);
        qc.getCriteriaQuery().where(cond1);

        return getResultList(qc.getCriteriaQuery());
    }

    /**
     * Retrieve team by short name
     *
     * @param shortName Team short name to find
     * @return Teams associated with short name
     */
    public List<Team> getByShortName(String shortName){
        QueryContainer<Team> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate cond1 = qc.getCriteriaBuilder().like(qc.getRoot().get(Team_.name), shortName);
        qc.getCriteriaQuery().where(cond1);

        return getResultList(qc.getCriteriaQuery());
    }

}
