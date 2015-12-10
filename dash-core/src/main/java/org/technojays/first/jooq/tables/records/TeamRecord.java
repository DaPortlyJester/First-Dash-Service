/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.technojays.first.jooq.tables.Team;


/**
 * A team associated with a specific FIRST program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamRecord extends UpdatableRecordImpl<TeamRecord> implements Record5<Integer, Integer, Integer, String, String> {

	private static final long serialVersionUID = 2069335195;

	/**
	 * Setter for <code>first.team.id</code>. system id forteam
	 */
	public TeamRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.team.id</code>. system id forteam
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.team.program_id</code>. system id for the associated program
	 */
	public TeamRecord setProgramId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.team.program_id</code>. system id for the associated program
	 */
	public Integer getProgramId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.team.number</code>. number for this team
	 */
	public TeamRecord setNumber(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.team.number</code>. number for this team
	 */
	public Integer getNumber() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>first.team.name</code>.  name for this team
	 */
	public TeamRecord setName(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>first.team.name</code>.  name for this team
	 */
	public String getName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>first.team.short_name</code>. Team Short Name
	 */
	public TeamRecord setShortName(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>first.team.short_name</code>. Team Short Name
	 */
	public String getShortName() {
		return (String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Integer, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Integer, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Team.TEAM.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Team.TEAM.PROGRAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Team.TEAM.NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Team.TEAM.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Team.TEAM.SHORT_NAME;
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
		return getProgramId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getShortName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord value2(Integer value) {
		setProgramId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord value3(Integer value) {
		setNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord value5(String value) {
		setShortName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TeamRecord
	 */
	public TeamRecord() {
		super(Team.TEAM);
	}

	/**
	 * Create a detached, initialised TeamRecord
	 */
	public TeamRecord(Integer id, Integer programId, Integer number, String name, String shortName) {
		super(Team.TEAM);

		setValue(0, id);
		setValue(1, programId);
		setValue(2, number);
		setValue(3, name);
		setValue(4, shortName);
	}
}
