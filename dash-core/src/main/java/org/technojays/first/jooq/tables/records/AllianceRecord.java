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
import org.technojays.first.jooq.tables.Alliance;


/**
 * Relationship between a match and a group of allies
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllianceRecord extends UpdatableRecordImpl<AllianceRecord> implements Record4<Integer, Integer, Integer, String> {

	private static final long serialVersionUID = 1308957935;

	/**
	 * Setter for <code>first.alliance.id</code>. system id for this alliance
	 */
	public AllianceRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.alliance.id</code>. system id for this alliance
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.alliance.type</code>. type (color) for this alliance
	 */
	public AllianceRecord setType(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.alliance.type</code>. type (color) for this alliance
	 */
	public Integer getType() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.alliance.match_id</code>. system id for the associated match
	 */
	public AllianceRecord setMatchId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.alliance.match_id</code>. system id for the associated match
	 */
	public Integer getMatchId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>first.alliance.ally_ref</code>. ally->alliance reference for all teams that were a part of this alliance (sha from team numbers)
	 */
	public AllianceRecord setAllyRef(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>first.alliance.ally_ref</code>. ally->alliance reference for all teams that were a part of this alliance (sha from team numbers)
	 */
	public String getAllyRef() {
		return (String) getValue(3);
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
	public Row4<Integer, Integer, Integer, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, Integer, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Alliance.ALLIANCE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Alliance.ALLIANCE.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Alliance.ALLIANCE.MATCH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Alliance.ALLIANCE.ALLY_REF;
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
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getMatchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getAllyRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceRecord value2(Integer value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceRecord value3(Integer value) {
		setMatchId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceRecord value4(String value) {
		setAllyRef(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceRecord values(Integer value1, Integer value2, Integer value3, String value4) {
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
	 * Create a detached AllianceRecord
	 */
	public AllianceRecord() {
		super(Alliance.ALLIANCE);
	}

	/**
	 * Create a detached, initialised AllianceRecord
	 */
	public AllianceRecord(Integer id, Integer type, Integer matchId, String allyRef) {
		super(Alliance.ALLIANCE);

		setValue(0, id);
		setValue(1, type);
		setValue(2, matchId);
		setValue(3, allyRef);
	}
}