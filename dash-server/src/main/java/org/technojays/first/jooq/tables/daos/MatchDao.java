/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.first.jooq.tables.Match;
import org.technojays.first.jooq.tables.records.MatchRecord;


/**
 * Describe a match where teams competed against each other
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MatchDao extends DAOImpl<MatchRecord, org.technojays.first.jooq.tables.pojos.Match, Integer> {

	/**
	 * Create a new MatchDao without any configuration
	 */
	public MatchDao() {
		super(Match.MATCH, org.technojays.first.jooq.tables.pojos.Match.class);
	}

	/**
	 * Create a new MatchDao with an attached configuration
	 */
	public MatchDao(Configuration configuration) {
		super(Match.MATCH, org.technojays.first.jooq.tables.pojos.Match.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.first.jooq.tables.pojos.Match object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Match> fetchById(Integer... values) {
		return fetch(Match.MATCH.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.first.jooq.tables.pojos.Match fetchOneById(Integer value) {
		return fetchOne(Match.MATCH.ID, value);
	}

	/**
	 * Fetch records that have <code>match_number IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Match> fetchByMatchNumber(Integer... values) {
		return fetch(Match.MATCH.MATCH_NUMBER, values);
	}

	/**
	 * Fetch records that have <code>competition_id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Match> fetchByCompetitionId(Integer... values) {
		return fetch(Match.MATCH.COMPETITION_ID, values);
	}

	/**
	 * Fetch records that have <code>start_time IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Match> fetchByStartTime(Timestamp... values) {
		return fetch(Match.MATCH.START_TIME, values);
	}

	/**
	 * Fetch records that have <code>end_time IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.Match> fetchByEndTime(Timestamp... values) {
		return fetch(Match.MATCH.END_TIME, values);
	}
}
