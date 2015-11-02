/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class TeamAttribute implements ITeamAttribute {

	private static final long serialVersionUID = 849167619;

	private Integer id;
	private Integer teamId;
	private Object  attributes;

	public TeamAttribute() {}

	public TeamAttribute(TeamAttribute value) {
		this.id = value.id;
		this.teamId = value.teamId;
		this.attributes = value.attributes;
	}

	public TeamAttribute(
		Integer id,
		Integer teamId,
		Object  attributes
	) {
		this.id = id;
		this.teamId = teamId;
		this.attributes = attributes;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public TeamAttribute setId(Integer id) {
		this.id = id;
		return this;
	}

	@Column(name = "team_id", unique = true, precision = 32)
	@Override
	public Integer getTeamId() {
		return this.teamId;
	}

	@Override
	public TeamAttribute setTeamId(Integer teamId) {
		this.teamId = teamId;
		return this;
	}

	@Column(name = "attributes")
	@Override
	public Object getAttributes() {
		return this.attributes;
	}

	@Override
	public TeamAttribute setAttributes(Object attributes) {
		this.attributes = attributes;
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
}