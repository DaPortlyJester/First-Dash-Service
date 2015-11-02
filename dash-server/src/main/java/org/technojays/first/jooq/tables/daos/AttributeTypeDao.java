/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.technojays.first.jooq.tables.AttributeType;
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
public class AttributeTypeDao extends DAOImpl<AttributeTypeRecord, org.technojays.first.jooq.tables.pojos.AttributeType, Integer> {

	/**
	 * Create a new AttributeTypeDao without any configuration
	 */
	public AttributeTypeDao() {
		super(AttributeType.ATTRIBUTE_TYPE, org.technojays.first.jooq.tables.pojos.AttributeType.class);
	}

	/**
	 * Create a new AttributeTypeDao with an attached configuration
	 */
	public AttributeTypeDao(Configuration configuration) {
		super(AttributeType.ATTRIBUTE_TYPE, org.technojays.first.jooq.tables.pojos.AttributeType.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.technojays.first.jooq.tables.pojos.AttributeType object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.AttributeType> fetchById(Integer... values) {
		return fetch(AttributeType.ATTRIBUTE_TYPE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.technojays.first.jooq.tables.pojos.AttributeType fetchOneById(Integer value) {
		return fetchOne(AttributeType.ATTRIBUTE_TYPE.ID, value);
	}

	/**
	 * Fetch records that have <code>info IN (values)</code>
	 */
	public List<org.technojays.first.jooq.tables.pojos.AttributeType> fetchByInfo(Object... values) {
		return fetch(AttributeType.ATTRIBUTE_TYPE.INFO, values);
	}
}