/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.first.jooq.tables.Team;
import org.technojays.first.jooq.tables.records.TeamRecord;


/**
 * A team associated with a specific FIRST program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamDao extends DAOImpl<TeamRecord, org.technojays.first.jooq.tables.pojos.Team, Integer> {

	/**
	 * Create a new TeamDao without any configuration
	 */
	public TeamDao() {
		super(Team.TEAM, org.technojays.first.jooq.tables.pojos.Team.class);
	}

	/**
	 * Create a new TeamDao with an attached configuration
	 */
	public TeamDao(Configuration configuration) {
		super(Team.TEAM, org.technojays.first.jooq.tables.pojos.Team.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.first.jooq.tables.pojos.Team object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Team> fetchById(Integer... values) {
		return fetch(Team.TEAM.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.first.jooq.tables.pojos.Team fetchOneById(Integer value) {
		return fetchOne(Team.TEAM.ID, value);
	}

	/**
	 * Fetch records that have <code>program_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Team> fetchByProgramId(Integer... values) {
		return fetch(Team.TEAM.PROGRAM_ID, values);
	}

	/**
	 * Fetch records that have <code>number IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Team> fetchByNumber(Integer... values) {
		return fetch(Team.TEAM.NUMBER, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Team> fetchByName(String... values) {
		return fetch(Team.TEAM.NAME, values);
	}

	/**
	 * Fetch records that have <code>short_name IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Team> fetchByShortName(String[]... values) {
		return fetch(Team.TEAM.SHORT_NAME, values);
	}

	/**
	 * Fetch a unique record that has <code>short_name = value</code>
	 */
	public org.technojays.first.jooq.tables.pojos.Team fetchOneByShortName(String[] value) {
		return fetchOne(Team.TEAM.SHORT_NAME, value);
	}
}