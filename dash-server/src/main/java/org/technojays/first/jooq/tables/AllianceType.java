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
import org.technojays.first.jooq.tables.records.AllianceTypeRecord;


/**
 * Alliance types for FIRST programs
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllianceType extends TableImpl<AllianceTypeRecord> {

	private static final long serialVersionUID = 1083081314;

	/**
	 * The reference instance of <code>first.alliance_type</code>
	 */
	public static final AllianceType ALLIANCE_TYPE = new AllianceType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllianceTypeRecord> getRecordType() {
		return AllianceTypeRecord.class;
	}

	/**
	 * The column <code>first.alliance_type.id</code>. System id for alliance type
	 */
	public final TableField<AllianceTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "System id for alliance type");

	/**
	 * The column <code>first.alliance_type.name</code>. Name for alliance type
	 */
	public final TableField<AllianceTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "Name for alliance type");

	/**
	 * The column <code>first.alliance_type.short_name</code>. Short Name for alliance type
	 */
	public final TableField<AllianceTypeRecord, String[]> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "Short Name for alliance type");

	/**
	 * Create a <code>first.alliance_type</code> table reference
	 */
	public AllianceType() {
		this("alliance_type", null);
	}

	/**
	 * Create an aliased <code>first.alliance_type</code> table reference
	 */
	public AllianceType(String alias) {
		this(alias, ALLIANCE_TYPE);
	}

	private AllianceType(String alias, Table<AllianceTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private AllianceType(String alias, Table<AllianceTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Alliance types for FIRST programs");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AllianceTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ALLIANCE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AllianceTypeRecord> getPrimaryKey() {
		return Keys.ALLIANCE_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AllianceTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<AllianceTypeRecord>>asList(Keys.ALLIANCE_TYPE_PK, Keys.ALLIANCE_TYPE_SN_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllianceType as(String alias) {
		return new AllianceType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AllianceType rename(String name) {
		return new AllianceType(name, null);
	}
}
