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
import org.technojays.first.jooq.tables.records.AwardTypeRecord;


/**
 * Award types
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AwardType extends TableImpl<AwardTypeRecord> {

	private static final long serialVersionUID = -998095734;

	/**
	 * The reference instance of <code>first.award_type</code>
	 */
	public static final AwardType AWARD_TYPE = new AwardType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AwardTypeRecord> getRecordType() {
		return AwardTypeRecord.class;
	}

	/**
	 * The column <code>first.award_type.id</code>.
	 */
	public final TableField<AwardTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>first.award_type.info</code>. award type info
	 */
	public final TableField<AwardTypeRecord, Object> INFO = createField("info", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "award type info");

	/**
	 * Create a <code>first.award_type</code> table reference
	 */
	public AwardType() {
		this("award_type", null);
	}

	/**
	 * Create an aliased <code>first.award_type</code> table reference
	 */
	public AwardType(String alias) {
		this(alias, AWARD_TYPE);
	}

	private AwardType(String alias, Table<AwardTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private AwardType(String alias, Table<AwardTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Award types");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AwardTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_AWARD_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AwardTypeRecord> getPrimaryKey() {
		return Keys.AWARD_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AwardTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<AwardTypeRecord>>asList(Keys.AWARD_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AwardType as(String alias) {
		return new AwardType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AwardType rename(String name) {
		return new AwardType(name, null);
	}
}
