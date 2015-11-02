/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.jooq.tables.AllianceRef;
import org.technojays.jooq.tables.records.AllianceRefRecord;


/**
 * Alliance reference of hash generated from ordered list of teams
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllianceRefDao extends DAOImpl<AllianceRefRecord, org.technojays.jooq.tables.pojos.AllianceRef, Integer> {

	/**
	 * Create a new AllianceRefDao without any configuration
	 */
	public AllianceRefDao() {
		super(AllianceRef.ALLIANCE_REF, org.technojays.jooq.tables.pojos.AllianceRef.class);
	}

	/**
	 * Create a new AllianceRefDao with an attached configuration
	 */
	public AllianceRefDao(Configuration configuration) {
		super(AllianceRef.ALLIANCE_REF, org.technojays.jooq.tables.pojos.AllianceRef.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.jooq.tables.pojos.AllianceRef object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.AllianceRef> fetchById(Integer... values) {
		return fetch(AllianceRef.ALLIANCE_REF.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.jooq.tables.pojos.AllianceRef fetchOneById(Integer value) {
		return fetchOne(AllianceRef.ALLIANCE_REF.ID, value);
	}

	/**
	 * Fetch records that have <code>hash_ref IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.AllianceRef> fetchByHashRef(String... values) {
		return fetch(AllianceRef.ALLIANCE_REF.HASH_REF, values);
	}

	/**
	 * Fetch a unique record that has <code>hash_ref = value</code>
	 */
	public org.technojays.jooq.tables.pojos.AllianceRef fetchOneByHashRef(String value) {
		return fetchOne(AllianceRef.ALLIANCE_REF.HASH_REF, value);
	}
}