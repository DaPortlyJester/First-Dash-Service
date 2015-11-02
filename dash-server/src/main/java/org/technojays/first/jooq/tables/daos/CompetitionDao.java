/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.first.jooq.tables.Competition;
import org.technojays.first.jooq.tables.records.CompetitionRecord;


/**
 * A competition describes a Location, Game, and is held at an Event
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompetitionDao extends DAOImpl<CompetitionRecord, org.technojays.first.jooq.tables.pojos.Competition, Integer> {

	/**
	 * Create a new CompetitionDao without any configuration
	 */
	public CompetitionDao() {
		super(Competition.COMPETITION, org.technojays.first.jooq.tables.pojos.Competition.class);
	}

	/**
	 * Create a new CompetitionDao with an attached configuration
	 */
	public CompetitionDao(Configuration configuration) {
		super(Competition.COMPETITION, org.technojays.first.jooq.tables.pojos.Competition.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.first.jooq.tables.pojos.Competition object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchById(Integer... values) {
		return fetch(Competition.COMPETITION.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.first.jooq.tables.pojos.Competition fetchOneById(Integer value) {
		return fetchOne(Competition.COMPETITION.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchByName(String... values) {
		return fetch(Competition.COMPETITION.NAME, values);
	}

	/**
	 * Fetch records that have <code>type_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchByTypeId(Integer... values) {
		return fetch(Competition.COMPETITION.TYPE_ID, values);
	}

	/**
	 * Fetch records that have <code>event_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchByEventId(Integer... values) {
		return fetch(Competition.COMPETITION.EVENT_ID, values);
	}

	/**
	 * Fetch records that have <code>location_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchByLocationId(Integer... values) {
		return fetch(Competition.COMPETITION.LOCATION_ID, values);
	}

	/**
	 * Fetch records that have <code>game_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Competition> fetchByGameId(Integer... values) {
		return fetch(Competition.COMPETITION.GAME_ID, values);
	}
}
