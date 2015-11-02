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
import org.technojays.first.jooq.tables.records.AllyRecord;


/**
 * Relationship between a set of teams for an alliance
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ally extends TableImpl<AllyRecord> {

	private static final long serialVersionUID = 1260369047;

	/**
	 * The reference instance of <code>first.ally</code>
	 */
	public static final Ally ALLY = new Ally();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllyRecord> getRecordType() {
		return AllyRecord.class;
	}

	/**
	 * The column <code>first.ally.id</code>.
	 */
	public final TableField<AllyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>first.ally.team_id</code>.
	 */
	public final TableField<AllyRecord, Integer> TEAM_ID = createField("team_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>first.ally.ally_ref</code>.
	 */
	public final TableField<AllyRecord, String[]> ALLY_REF = createField("ally_ref", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>first.ally</code> table reference
	 */
	public Ally() {
		this("ally", null);
	}

	/**
	 * Create an aliased <code>first.ally</code> table reference
	 */
	public Ally(String alias) {
		this(alias, ALLY);
	}

	private Ally(String alias, Table<AllyRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ally(String alias, Table<AllyRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Relationship between a set of teams for an alliance");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AllyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ALLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AllyRecord> getPrimaryKey() {
		return Keys.ALLIES_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AllyRecord>> getKeys() {
		return Arrays.<UniqueKey<AllyRecord>>asList(Keys.ALLIES_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ally as(String alias) {
		return new Ally(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Ally rename(String name) {
		return new Ally(name, null);
	}
}