package org.technojays.first.dao;

import org.technojays.first.model.Event;
import org.technojays.first.model.metamodel.Event_;

import javax.persistence.criteria.Predicate;
import java.util.List;

/**
 * @author derelle.redmond
 * @since 2/14/15.
 */
public class EventDAO extends AbstractDAO<Event> {

    public EventDAO() {
        super(Event.class);
    }

    /**
     * Retrieve events matching on event name
     *
     * @param name Name of the event
     * @return Events that have a matching event name
     */
    public List<Event> getByEventName(String name ) {
        QueryContainer<Event> qc = new QueryContainer<>(getEntityManager(), this.entityClass);

        Predicate cond1 = qc.getCriteriaBuilder().like(qc.getRoot().get(Event_.name), addLikeFilter(name));
        qc.getCriteriaQuery().where(cond1);

        return getResultList(qc.getCriteriaQuery());
    }




}
