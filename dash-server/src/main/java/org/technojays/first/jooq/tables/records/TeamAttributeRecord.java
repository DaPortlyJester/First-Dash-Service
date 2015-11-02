/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.records;


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
import org.technojays.first.jooq.tables.TeamAttribute;
import org.technojays.first.jooq.tables.interfaces.ITeamAttribute;


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
@Table(name = "team_attribute", schema = "first")
public class TeamAttributeRecord extends UpdatableRecordImpl<TeamAttributeRecord> implements Record3<Integer, Integer, Object>, ITeamAttribute {

	private static final long serialVersionUID = -366121922;

	/**
	 * Setter for <code>first.team_attribute.id</code>. system id for this attribute
	 */
	@Override
	public TeamAttributeRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attribute.id</code>. system id for this attribute
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.team_attribute.team_id</code>. system id for associated team
	 */
	@Override
	public TeamAttributeRecord setTeamId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attribute.team_id</code>. system id for associated team
	 */
	@Column(name = "team_id", unique = true, precision = 32)
	@Override
	public Integer getTeamId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>first.team_attribute.attributes</code>. attributes
	 */
	@Override
	public TeamAttributeRecord setAttributes(Object value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.team_attribute.attributes</code>. attributes
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
		return TeamAttribute.TEAM_ATTRIBUTE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TeamAttribute.TEAM_ATTRIBUTE.TEAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field3() {
		return TeamAttribute.TEAM_ATTRIBUTE.ATTRIBUTES;
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
	public TeamAttributeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributeRecord value2(Integer value) {
		setTeamId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributeRecord value3(Object value) {
		setAttributes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamAttributeRecord values(Integer value1, Integer value2, Object value3) {
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
	public void from(ITeamAttribute from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setAttributes(from.getAttributes());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITeamAttribute> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TeamAttributeRecord
	 */
	public TeamAttributeRecord() {
		super(TeamAttribute.TEAM_ATTRIBUTE);
	}

	/**
	 * Create a detached, initialised TeamAttributeRecord
	 */
	public TeamAttributeRecord(Integer id, Integer teamId, Object attributes) {
		super(TeamAttribute.TEAM_ATTRIBUTE);

		setValue(0, id);
		setValue(1, teamId);
		setValue(2, attributes);
	}
}
