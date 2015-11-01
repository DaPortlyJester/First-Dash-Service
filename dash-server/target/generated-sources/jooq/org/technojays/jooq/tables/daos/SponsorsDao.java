/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.jooq.tables.Sponsors;
import org.technojays.jooq.tables.records.SponsorsRecord;


/**
 * Sponsors for teams, events, groups, programs, etc
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SponsorsDao extends DAOImpl<SponsorsRecord, org.technojays.jooq.tables.pojos.Sponsors, Integer> {

	/**
	 * Create a new SponsorsDao without any configuration
	 */
	public SponsorsDao() {
		super(Sponsors.SPONSORS, org.technojays.jooq.tables.pojos.Sponsors.class);
	}

	/**
	 * Create a new SponsorsDao with an attached configuration
	 */
	public SponsorsDao(Configuration configuration) {
		super(Sponsors.SPONSORS, org.technojays.jooq.tables.pojos.Sponsors.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.jooq.tables.pojos.Sponsors object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.Sponsors> fetchById(Integer... values) {
		return fetch(Sponsors.SPONSORS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.jooq.tables.pojos.Sponsors fetchOneById(Integer value) {
		return fetchOne(Sponsors.SPONSORS.ID, value);
	}

	/**
	 * Fetch records that have <code>info IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.Sponsors> fetchByInfo(Object... values) {
		return fetch(Sponsors.SPONSORS.INFO, values);
	}
}
