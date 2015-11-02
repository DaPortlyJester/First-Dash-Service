/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Sponsors associated with a FIRST team for a given game (season)
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
@Table(name = "team_sponsor", schema = "first", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"team_id", "sponsor_id", "game_id"})
})
public interface ITeamSponsor extends Serializable {

	/**
	 * Setter for <code>first.team_sponsor.id</code>. system id for this team sponsor
	 */
	public ITeamSponsor setId(Integer value);

	/**
	 * Getter for <code>first.team_sponsor.id</code>. system id for this team sponsor
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	public Integer getId();

	/**
	 * Setter for <code>first.team_sponsor.team_id</code>. system id for the associated
	 */
	public ITeamSponsor setTeamId(Integer value);

	/**
	 * Getter for <code>first.team_sponsor.team_id</code>. system id for the associated
	 */
	@Column(name = "team_id", precision = 32)
	public Integer getTeamId();

	/**
	 * Setter for <code>first.team_sponsor.sponsor_id</code>. system id for the associated sponsor
	 */
	public ITeamSponsor setSponsorId(Integer value);

	/**
	 * Getter for <code>first.team_sponsor.sponsor_id</code>. system id for the associated sponsor
	 */
	@Column(name = "sponsor_id", precision = 32)
	public Integer getSponsorId();

	/**
	 * Setter for <code>first.team_sponsor.game_id</code>. system id for the associated game
	 */
	public ITeamSponsor setGameId(Integer value);

	/**
	 * Getter for <code>first.team_sponsor.game_id</code>. system id for the associated game
	 */
	@Column(name = "game_id", precision = 32)
	public Integer getGameId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITeamSponsor
	 */
	public void from(org.technojays.first.jooq.tables.interfaces.ITeamSponsor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITeamSponsor
	 */
	public <E extends org.technojays.first.jooq.tables.interfaces.ITeamSponsor> E into(E into);
}
