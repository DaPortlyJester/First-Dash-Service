/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.technojays.first.jooq.First;
import org.technojays.first.jooq.Keys;
import org.technojays.first.jooq.tables.records.LocationRecord;


/**
 * Locations for program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Location extends TableImpl<LocationRecord> {

	private static final long serialVersionUID = 156520490;

	/**
	 * The reference instance of <code>first.location</code>
	 */
	public static final Location LOCATION = new Location();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LocationRecord> getRecordType() {
		return LocationRecord.class;
	}

	/**
	 * The column <code>first.location.id</code>. location system id
	 */
	public final TableField<LocationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "location system id");

	/**
	 * The column <code>first.location.lng</code>.
	 */
	public final TableField<LocationRecord, Double> LNG = createField("lng", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>first.location.lat</code>.
	 */
	public final TableField<LocationRecord, Double> LAT = createField("lat", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>first.location.place_id</code>.
	 */
	public final TableField<LocationRecord, Integer> PLACE_ID = createField("place_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>first.location</code> table reference
	 */
	public Location() {
		this("location", null);
	}

	/**
	 * Create an aliased <code>first.location</code> table reference
	 */
	public Location(String alias) {
		this(alias, LOCATION);
	}

	private Location(String alias, Table<LocationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Location(String alias, Table<LocationRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Locations for program");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<LocationRecord, Integer> getIdentity() {
		return Keys.IDENTITY_LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LocationRecord> getPrimaryKey() {
		return Keys.LOCATIONS_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LocationRecord>> getKeys() {
		return Arrays.<UniqueKey<LocationRecord>>asList(Keys.LOCATIONS_PK, Keys.PLACE_ID_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Location as(String alias) {
		return new Location(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Location rename(String name) {
		return new Location(name, null);
	}
}