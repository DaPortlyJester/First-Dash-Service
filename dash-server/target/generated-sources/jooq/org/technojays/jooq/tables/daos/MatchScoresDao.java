/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.jooq.tables.MatchScores;
import org.technojays.jooq.tables.records.MatchScoresRecord;


/**
 * Scores associated with a match
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MatchScoresDao extends DAOImpl<MatchScoresRecord, org.technojays.jooq.tables.pojos.MatchScores, Integer> {

	/**
	 * Create a new MatchScoresDao without any configuration
	 */
	public MatchScoresDao() {
		super(MatchScores.MATCH_SCORES, org.technojays.jooq.tables.pojos.MatchScores.class);
	}

	/**
	 * Create a new MatchScoresDao with an attached configuration
	 */
	public MatchScoresDao(Configuration configuration) {
		super(MatchScores.MATCH_SCORES, org.technojays.jooq.tables.pojos.MatchScores.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.jooq.tables.pojos.MatchScores object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.MatchScores> fetchById(Integer... values) {
		return fetch(MatchScores.MATCH_SCORES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.jooq.tables.pojos.MatchScores fetchOneById(Integer value) {
		return fetchOne(MatchScores.MATCH_SCORES.ID, value);
	}

	/**
	 * Fetch records that have <code>match_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.MatchScores> fetchByMatchId(Integer... values) {
		return fetch(MatchScores.MATCH_SCORES.MATCH_ID, values);
	}

	/**
	 * Fetch records that have <code>alliance_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.MatchScores> fetchByAllianceId(Integer... values) {
		return fetch(MatchScores.MATCH_SCORES.ALLIANCE_ID, values);
	}

	/**
	 * Fetch records that have <code>score_type_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.MatchScores> fetchByScoreTypeId(Integer... values) {
		return fetch(MatchScores.MATCH_SCORES.SCORE_TYPE_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.MatchScores> fetchByValue(String[]... values) {
		return fetch(MatchScores.MATCH_SCORES.VALUE, values);
	}
}