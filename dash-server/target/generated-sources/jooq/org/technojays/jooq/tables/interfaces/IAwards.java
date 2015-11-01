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
 * Awards awarded at competitions and events
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
@Table(name = "awards", schema = "first", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"type_id", "event_id", "competition_id", "team_id"})
})
public interface IAwards extends Serializable {

	/**
	 * Setter for <code>first.awards.id</code>. system id for this award
	 */
	public IAwards setId(Integer value);

	/**
	 * Getter for <code>first.awards.id</code>. system id for this award
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	public Integer getId();

	/**
	 * Setter for <code>first.awards.type_id</code>. system id for the type of this award
	 */
	public IAwards setTypeId(Integer value);

	/**
	 * Getter for <code>first.awards.type_id</code>. system id for the type of this award
	 */
	@Column(name = "type_id", precision = 32)
	public Integer getTypeId();

	/**
	 * Setter for <code>first.awards.event_id</code>. system id for the associated event
	 */
	public IAwards setEventId(Integer value);

	/**
	 * Getter for <code>first.awards.event_id</code>. system id for the associated event
	 */
	@Column(name = "event_id", precision = 32)
	public Integer getEventId();

	/**
	 * Setter for <code>first.awards.competition_id</code>. system id for the competition this award is assocaited with
	 */
	public IAwards setCompetitionId(Integer value);

	/**
	 * Getter for <code>first.awards.competition_id</code>. system id for the competition this award is assocaited with
	 */
	@Column(name = "competition_id", precision = 32)
	public Integer getCompetitionId();

	/**
	 * Setter for <code>first.awards.team_id</code>. system id for the team this award is associated with
	 */
	public IAwards setTeamId(Integer value);

	/**
	 * Getter for <code>first.awards.team_id</code>. system id for the team this award is associated with
	 */
	@Column(name = "team_id", precision = 32)
	public Integer getTeamId();

	/**
	 * Setter for <code>first.awards.awardee_id</code>. system id for the awardee of this award
	 */
	public IAwards setAwardeeId(Integer value);

	/**
	 * Getter for <code>first.awards.awardee_id</code>. system id for the awardee of this award
	 */
	@Column(name = "awardee_id", precision = 32)
	public Integer getAwardeeId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IAwards
	 */
	public void from(org.technojays.jooq.tables.interfaces.IAwards from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IAwards
	 */
	public <E extends org.technojays.jooq.tables.interfaces.IAwards> E into(E into);
}
