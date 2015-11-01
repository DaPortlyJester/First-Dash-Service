/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.jooq.tables.TeamScores;
import org.technojays.jooq.tables.records.TeamScoresRecord;


/**
 * Scores associated with a FIRST team during a match at a competition
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamScoresDao extends DAOImpl<TeamScoresRecord, org.technojays.jooq.tables.pojos.TeamScores, Integer> {

	/**
	 * Create a new TeamScoresDao without any configuration
	 */
	public TeamScoresDao() {
		super(TeamScores.TEAM_SCORES, org.technojays.jooq.tables.pojos.TeamScores.class);
	}

	/**
	 * Create a new TeamScoresDao with an attached configuration
	 */
	public TeamScoresDao(Configuration configuration) {
		super(TeamScores.TEAM_SCORES, org.technojays.jooq.tables.pojos.TeamScores.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.jooq.tables.pojos.TeamScores object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.TeamScores> fetchById(Integer... values) {
		return fetch(TeamScores.TEAM_SCORES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.jooq.tables.pojos.TeamScores fetchOneById(Integer value) {
		return fetchOne(TeamScores.TEAM_SCORES.ID, value);
	}

	/**
	 * Fetch records that have <code>team_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.TeamScores> fetchByTeamId(Integer... values) {
		return fetch(TeamScores.TEAM_SCORES.TEAM_ID, values);
	}

	/**
	 * Fetch records that have <code>match_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.TeamScores> fetchByMatchId(Integer... values) {
		return fetch(TeamScores.TEAM_SCORES.MATCH_ID, values);
	}

	/**
	 * Fetch records that have <code>score_type_id IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.TeamScores> fetchByScoreTypeId(Integer... values) {
		return fetch(TeamScores.TEAM_SCORES.SCORE_TYPE_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public List<org.technojays.jooq.tables.pojos.TeamScores> fetchByValue(String[]... values) {
		return fetch(TeamScores.TEAM_SCORES.VALUE, values);
	}
}
