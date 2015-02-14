package org.technojays.first.dao;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import java.util.List;

/**
 * @author Derelle.Redmond
 * @since 2/9/2015
 * <p/>
 * Abstract DAO for all Entity types to implement
 */
public abstract class AbstractDAO<T> {
    protected Class<T> entityClass;

    @Inject
    private EntityManager em;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * Get entity manager for this DAO
     *
     * @return Entity Manager associated with this DAO
     */
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Get the metamodel associated with the entity for this DAO
     *
     * @return metamodel for the entity associated with this metamodel
     */
    protected EntityType<T> getMetaModel() {
        return getEntityManager().getMetamodel().entity(entityClass);
    }

    @Transactional
    public void save(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();
    }

    @Transactional
    public void update(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
    }

    @Transactional
    public void remove(Long entityId) {
        getEntityManager().getTransaction().begin();
        T entity = find(entityId);

        if (entity != null)
            remove(entity);
        getEntityManager().getTransaction().commit();
    }

    @Transactional
    public void remove(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(getEntityManager().merge(entity));
        getEntityManager().getTransaction().commit();
    }

    /**
     * Find object of Type t by id
     *
     * @param id Id to search for
     * @return Object with given id
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     * Find all objects of type T
     *
     * @return List of objects of type T
     */
    public List<T> findAll() {
        CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder()
                .createQuery(entityClass);
        cq.select(cq.from(entityClass));

        return getResultList(cq);
    }

    /**
     * Find all objects of type T
     *
     * @param start start of the range
     * @param end   end of the range
     * @return List of objects of type T in range
     */
    public List<T> findRange(int start, int end) {
        CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder()
                .createQuery(entityClass);
        cq.select(cq.from(entityClass));

        Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(end - start);
        q.setFirstResult(start);

        return q.getResultList();
    }

    /**
     * Get count of the associated object type
     *
     * @return count of this Entity
     */
    public int count() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<T> root = cq.from(entityClass);
        cq.select(cb.count(root));
        Long count = getEntityManager().createQuery(cq).getSingleResult();

        return count.intValue();
    }

    /**
     * Get single result from criteria query
     *
     * @param cq Criteria Query to get single result from
     * @return Single result
     */
    public T getSingleResult(CriteriaQuery<T> cq) {
        return getEntityManager().createQuery(cq).getSingleResult();
    }

    /**
     * Get list result from criteria query
     *
     * @param cq Criteria Query to get results from
     * @return List of results
     */
    public List<T> getResultList(CriteriaQuery<T> cq) {
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * Surround text to search on with '%' symbol
     *
     * @param textToSearch Text searching on
     * @return search text surrounded by '%'
     */
    public String addLikeFilter(String textToSearch) {
        return "%" + textToSearch + "%";
    }
}
