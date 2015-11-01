/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.technojays.jooq.tables.TeamAttributes;
import org.technojays.jooq.tables.interfaces.ITeamAttributes;


/**
 * Attributes associated with a FIRST team
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
@Table(name = "team_attributes", schema = "first")
public class TeamAttributesRecord extends UpdatableRecordImpl<TeamAttributesRecord> implements Record3<Integer, Integer, Object>, ITeamAttributes {

	private static final long serialVersionUID = -614671329;

	/**
	 * Setter for <code>first.team_attributes.id</code>. system id for this attribute
	 */
	@Override
	public TeamAttributesRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attributes.id</code>. system id for this attribute
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.team_attributes.team_id</code>. system id for associated team
	 */
	@Override
	public TeamAttributesRecord setTeamId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attributes.team_id</code>. system id for associated team
	 */
	@Column(name = "team_id", unique = true, precision = 32)
	@Override
	public Integer getTeamId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.team_attributes.attributes</code>. attributes
	 */
	@Override
	public TeamAttributesRecord setAttributes(Object value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attributes.attributes</code>. attributes
	 */
	@Column(name = "attributes")
	@Override
	public Object getAttributes() {
		return (Object) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Object> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Object> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TeamAttributes.TEAM_ATTRIBUTES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TeamAttributes.TEAM_ATTRIBUTES.TEAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field3() {
		return TeamAttributes.TEAM_ATTRIBUTES.ATTRIBUTES;
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
	public Object value3() {
		return getAttributes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributesRecord value2(Integer value) {
		setTeamId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributesRecord value3(Object value) {
		setAttributes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributesRecord values(Integer value1, Integer value2, Object value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITeamAttributes from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setAttributes(from.getAttributes());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITeamAttributes> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TeamAttributesRecord
	 */
	public TeamAttributesRecord() {
		super(TeamAttributes.TEAM_ATTRIBUTES);
	}

	/**
	 * Create a detached, initialised TeamAttributesRecord
	 */
	public TeamAttributesRecord(Integer id, Integer teamId, Object attributes) {
		super(TeamAttributes.TEAM_ATTRIBUTES);

		setValue(0, id);
		setValue(1, teamId);
		setValue(2, attributes);
	}
}
