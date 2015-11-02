/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.technojays.first.jooq.tables.TeamSponsor;


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
public class TeamSponsorRecord extends UpdatableRecordImpl<TeamSponsorRecord> implements Record4<Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = 659807280;

	/**
	 * Setter for <code>first.team_sponsor.id</code>. system id for this team sponsor
	 */
	public TeamSponsorRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsor.id</code>. system id for this team sponsor
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.team_sponsor.team_id</code>. system id for the associated
	 */
	public TeamSponsorRecord setTeamId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsor.team_id</code>. system id for the associated
	 */
	public Integer getTeamId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.team_sponsor.sponsor_id</code>. system id for the associated sponsor
	 */
	public TeamSponsorRecord setSponsorId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsor.sponsor_id</code>. system id for the associated sponsor
	 */
	public Integer getSponsorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>first.team_sponsor.game_id</code>. system id for the associated game
	 */
	public TeamSponsorRecord setGameId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_sponsor.game_id</code>. system id for the associated game
	 */
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
		return TeamSponsor.TEAM_SPONSOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TeamSponsor.TEAM_SPONSOR.TEAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TeamSponsor.TEAM_SPONSOR.SPONSOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TeamSponsor.TEAM_SPONSOR.GAME_ID;
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
	public TeamSponsorRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorRecord value2(Integer value) {
		setTeamId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorRecord value3(Integer value) {
		setSponsorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorRecord value4(Integer value) {
		setGameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsorRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TeamSponsorRecord
	 */
	public TeamSponsorRecord() {
		super(TeamSponsor.TEAM_SPONSOR);
	}

	/**
	 * Create a detached, initialised TeamSponsorRecord
	 */
	public TeamSponsorRecord(Integer id, Integer teamId, Integer sponsorId, Integer gameId) {
		super(TeamSponsor.TEAM_SPONSOR);

		setValue(0, id);
		setValue(1, teamId);
		setValue(2, sponsorId);
		setValue(3, gameId);
	}
}