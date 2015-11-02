/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.technojays.jooq.tables.TeamSponsors;
import org.technojays.jooq.tables.interfaces.ITeamSponsors;


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
@Table(name = "team_sponsors", schema = "first", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"team_id", "sponsor_id", "game_id"})
})
public class TeamSponsorsRecord extends UpdatableRecordImpl<TeamSponsorsRecord> implements Record4<Integer, Integer, Integer, Integer>, ITeamSponsors {

	private static final long serialVersionUID = -1172441448;

	/**
	 * Setter for <code>first.team_sponsors.id</code>. system id for this team sponsor
	 */
	@Override
	public TeamSponsorsRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsors.id</code>. system id for this team sponsor
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.team_sponsors.team_id</code>. system id for the associated
	 */
	@Override
	public TeamSponsorsRecord setTeamId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsors.team_id</code>. system id for the associated
	 */
	@Column(name = "team_id", precision = 32)
	@Override
	public Integer getTeamId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.team_sponsors.sponsor_id</code>. system id for the associated sponsor
	 */
	@Override
	public TeamSponsorsRecord setSponsorId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsors.sponsor_id</code>. system id for the associated sponsor
	 */
	@Column(name = "sponsor_id", precision = 32)
	@Override
	public Integer getSponsorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>first.team_sponsors.game_id</code>. system id for the associated game
	 */
	@Override
	public TeamSponsorsRecord setGameId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsors.game_id</code>. system id for the associated game
	 */
	@Column(name = "game_id", precision = 32)
	@Override
	public Integer getGameId() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, Integer, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TeamSponsors.TEAM_SPONSORS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TeamSponsors.TEAM_SPONSORS.TEAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TeamSponsors.TEAM_SPONSORS.SPONSOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TeamSponsors.TEAM_SPONSORS.GAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTeamId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getSponsorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getGameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorsRecord value2(Integer value) {
		setTeamId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorsRecord value3(Integer value) {
		setSponsorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorsRecord value4(Integer value) {
		setGameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorsRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITeamSponsors from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setSponsorId(from.getSponsorId());
		setGameId(from.getGameId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITeamSponsors> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TeamSponsorsRecord
	 */
	public TeamSponsorsRecord() {
		super(TeamSponsors.TEAM_SPONSORS);
	}

	/**
	 * Create a detached, initialised TeamSponsorsRecord
	 */
	public TeamSponsorsRecord(Integer id, Integer teamId, Integer sponsorId, Integer gameId) {
		super(TeamSponsors.TEAM_SPONSORS);

		setValue(0, id);
		setValue(1, teamId);
		setValue(2, sponsorId);
		setValue(3, gameId);
	}
}