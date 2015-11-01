/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


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
@Entity
@Table(name = "team_scores", schema = "first", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"team_id", "match_id", "score_type_id"})
})
public interface ITeamScores extends Serializable {

	/**
	 * Setter for <code>first.team_scores.id</code>. system id for this score
	 */
	public ITeamScores setId(Integer value);

	/**
	 * Getter for <code>first.team_scores.id</code>. system id for this score
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	public Integer getId();

	/**
	 * Setter for <code>first.team_scores.team_id</code>. system id for the associated team
	 */
	public ITeamScores setTeamId(Integer value);

	/**
	 * Getter for <code>first.team_scores.team_id</code>. system id for the associated team
	 */
	@Column(name = "team_id", precision = 32)
	public Integer getTeamId();

	/**
	 * Setter for <code>first.team_scores.match_id</code>. system id for the associated match
	 */
	public ITeamScores setMatchId(Integer value);

	/**
	 * Getter for <code>first.team_scores.match_id</code>. system id for the associated match
	 */
	@Column(name = "match_id", precision = 32)
	public Integer getMatchId();

	/**
	 * Setter for <code>first.team_scores.score_type_id</code>. system id for the associated score type
	 */
	public ITeamScores setScoreTypeId(Integer value);

	/**
	 * Getter for <code>first.team_scores.score_type_id</code>. system id for the associated score type
	 */
	@Column(name = "score_type_id", precision = 32)
	public Integer getScoreTypeId();

	/**
	 * Setter for <code>first.team_scores.value</code>. score value
	 */
	public ITeamScores setValue(String[] value);

	/**
	 * Getter for <code>first.team_scores.value</code>. score value
	 */
	@Column(name = "value")
	public String[] getValue();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITeamScores
	 */
	public void from(org.technojays.jooq.tables.interfaces.ITeamScores from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITeamScores
	 */
	public <E extends org.technojays.jooq.tables.interfaces.ITeamScores> E into(E into);
}
