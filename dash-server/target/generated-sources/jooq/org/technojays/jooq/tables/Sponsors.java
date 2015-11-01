/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.technojays.jooq.First;
import org.technojays.jooq.Keys;
import org.technojays.jooq.tables.records.SponsorsRecord;


/**
 * Sponsors for teams, events, groups, programs, etc
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sponsors extends TableImpl<SponsorsRecord> {

	private static final long serialVersionUID = 2019905767;

	/**
	 * The reference instance of <code>first.sponsors</code>
	 */
	public static final Sponsors SPONSORS = new Sponsors();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SponsorsRecord> getRecordType() {
		return SponsorsRecord.class;
	}

	/**
	 * The column <code>first.sponsors.id</code>. system id for this sponsor
	 */
	public final TableField<SponsorsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "system id for this sponsor");

	/**
	 * The column <code>first.sponsors.info</code>. sponsor information
	 */
	public final TableField<SponsorsRecord, Object> INFO = createField("info", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "sponsor information");

	/**
	 * Create a <code>first.sponsors</code> table reference
	 */
	public Sponsors() {
		this("sponsors", null);
	}

	/**
	 * Create an aliased <code>first.sponsors</code> table reference
	 */
	public Sponsors(String alias) {
		this(alias, SPONSORS);
	}

	private Sponsors(String alias, Table<SponsorsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sponsors(String alias, Table<SponsorsRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Sponsors for teams, events, groups, programs, etc\n");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<SponsorsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_SPONSORS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SponsorsRecord> getPrimaryKey() {
		return Keys.SPONSORS_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SponsorsRecord>> getKeys() {
		return Arrays.<UniqueKey<SponsorsRecord>>asList(Keys.SPONSORS_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sponsors as(String alias) {
		return new Sponsors(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sponsors rename(String name) {
		return new Sponsors(name, null);
	}
}
