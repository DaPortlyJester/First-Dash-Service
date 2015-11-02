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
import org.technojays.first.jooq.tables.records.AttributeTypeRecord;


/**
 * Attribute types in program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttributeType extends TableImpl<AttributeTypeRecord> {

	private static final long serialVersionUID = -728751048;

	/**
	 * The reference instance of <code>first.attribute_type</code>
	 */
	public static final AttributeType ATTRIBUTE_TYPE = new AttributeType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AttributeTypeRecord> getRecordType() {
		return AttributeTypeRecord.class;
	}

	/**
	 * The column <code>first.attribute_type.id</code>. system id for this attribute type
	 */
	public final TableField<AttributeTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "system id for this attribute type");

	/**
	 * The column <code>first.attribute_type.info</code>. info for this attribute type
	 */
	public final TableField<AttributeTypeRecord, Object> INFO = createField("info", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "info for this attribute type");

	/**
	 * Create a <code>first.attribute_type</code> table reference
	 */
	public AttributeType() {
		this("attribute_type", null);
	}

	/**
	 * Create an aliased <code>first.attribute_type</code> table reference
	 */
	public AttributeType(String alias) {
		this(alias, ATTRIBUTE_TYPE);
	}

	private AttributeType(String alias, Table<AttributeTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private AttributeType(String alias, Table<AttributeTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Attribute types in program");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AttributeTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ATTRIBUTE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AttributeTypeRecord> getPrimaryKey() {
		return Keys.ATTRIBUTE_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AttributeTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<AttributeTypeRecord>>asList(Keys.ATTRIBUTE_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttributeType as(String alias) {
		return new AttributeType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AttributeType rename(String name) {
		return new AttributeType(name, null);
	}
}
