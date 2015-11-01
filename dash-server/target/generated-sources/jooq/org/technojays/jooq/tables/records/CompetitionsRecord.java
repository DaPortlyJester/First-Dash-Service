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
import org.jooq.Record6;
import org.jooq.Row;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.technojays.jooq.tables.Competitions;
import org.technojays.jooq.tables.interfaces.ICompetitions;


/**
 * A competition describes a Location, Game, and is held at an Event
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
@Table(name = "competitions", schema = "first")
public class CompetitionsRecord extends UpdatableRecordImpl<CompetitionsRecord> implements Record6<Integer, String, Integer, Integer, Integer, Integer>, ICompetitions {

	private static final long serialVersionUID = -620056452;

	/**
	 * Setter for <code>first.competitions.id</code>.
	 */
	@Override
	public CompetitionsRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.id</code>.
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>first.competitions.name</code>.
	 */
	@Override
	public CompetitionsRecord setName(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.name</code>.
	 */
	@Column(name = "name")
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>first.competitions.type_id</code>. comptetion type id
	 */
	@Override
	public CompetitionsRecord setTypeId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.type_id</code>. comptetion type id
	 */
	@Column(name = "type_id", precision = 32)
	@Override
	public Integer getTypeId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>first.competitions.event_id</code>.
	 */
	@Override
	public CompetitionsRecord setEventId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.event_id</code>.
	 */
	@Column(name = "event_id", precision = 32)
	@Override
	public Integer getEventId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>first.competitions.location_id</code>.
	 */
	@Override
	public CompetitionsRecord setLocationId(Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.location_id</code>.
	 */
	@Column(name = "location_id", precision = 32)
	@Override
	public Integer getLocationId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>first.competitions.game_id</code>.
	 */
	@Override
	public CompetitionsRecord setGameId(Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>first.competitions.game_id</code>.
	 */
	@Column(name = "game_id", precision = 32)
	@Override
	public Integer getGameId() {
		return (Integer) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Competitions.COMPETITIONS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Competitions.COMPETITIONS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Competitions.COMPETITIONS.TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Competitions.COMPETITIONS.EVENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Competitions.COMPETITIONS.LOCATION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Competitions.COMPETITIONS.GAME_ID;
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
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getEventId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getLocationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getGameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value3(Integer value) {
		setTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value4(Integer value) {
		setEventId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value5(Integer value) {
		setLocationId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord value6(Integer value) {
		setGameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CompetitionsRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ICompetitions from) {
		setId(from.getId());
		setName(from.getName());
		setTypeId(from.getTypeId());
		setEventId(from.getEventId());
		setLocationId(from.getLocationId());
		setGameId(from.getGameId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ICompetitions> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CompetitionsRecord
	 */
	public CompetitionsRecord() {
		super(Competitions.COMPETITIONS);
	}

	/**
	 * Create a detached, initialised CompetitionsRecord
	 */
	public CompetitionsRecord(Integer id, String name, Integer typeId, Integer eventId, Integer locationId, Integer gameId) {
		super(Competitions.COMPETITIONS);

		setValue(0, id);
		setValue(1, name);
		setValue(2, typeId);
		setValue(3, eventId);
		setValue(4, locationId);
		setValue(5, gameId);
	}
}
