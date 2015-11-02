/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * A game describes a specific set of rules and competitions for a program 
 * and its teams. It has a period of time 
 * associated with it.
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
@Table(name = "game", schema = "first")
public interface IGame extends Serializable {

	/**
	 * Setter for <code>first.game.id</code>.
	 */
	public IGame setId(Integer value);

	/**
	 * Getter for <code>first.game.id</code>.
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	public Integer getId();

	/**
	 * Setter for <code>first.game.name</code>.
	 */
	public IGame setName(String value);

	/**
	 * Getter for <code>first.game.name</code>.
	 */
	@Column(name = "name")
	public String getName();

	/**
	 * Setter for <code>first.game.short_name</code>.
	 */
	public IGame setShortName(String[] value);

	/**
	 * Getter for <code>first.game.short_name</code>.
	 */
	@Column(name = "short_name", unique = true)
	public String[] getShortName();

	/**
	 * Setter for <code>first.game.program_id</code>. system id of associated program
	 */
	public IGame setProgramId(Integer value);

	/**
	 * Getter for <code>first.game.program_id</code>. system id of associated program
	 */
	@Column(name = "program_id", precision = 32)
	public Integer getProgramId();

	/**
	 * Setter for <code>first.game.start_date</code>. Game start date
	 */
	public IGame setStartDate(Timestamp value);

	/**
	 * Getter for <code>first.game.start_date</code>. Game start date
	 */
	@Column(name = "start_date")
	public Timestamp getStartDate();

	/**
	 * Setter for <code>first.game.end_date</code>. end date of season
	 */
	public IGame setEndDate(Timestamp value);

	/**
	 * Getter for <code>first.game.end_date</code>. end date of season
	 */
	@Column(name = "end_date")
	public Timestamp getEndDate();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IGame
	 */
	public void from(org.technojays.first.jooq.tables.interfaces.IGame from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IGame
	 */
	public <E extends org.technojays.first.jooq.tables.interfaces.IGame> E into(E into);
}
