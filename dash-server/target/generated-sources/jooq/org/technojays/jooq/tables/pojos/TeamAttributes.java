/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.technojays.jooq.tables.interfaces.ITeamAttributes;


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
@Table(name = "team_attributes", schema = "first")
public class TeamAttributes implements ITeamAttributes {

	private static final long serialVersionUID = 1082201308;

	private Integer id;
	private Integer teamId;
	private Object  attributes;

	public TeamAttributes() {}

	public TeamAttributes(TeamAttributes value) {
		this.id = value.id;
		this.teamId = value.teamId;
		this.attributes = value.attributes;
	}

	public TeamAttributes(
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
	public TeamAttributes setId(Integer id) {
		this.id = id;
		return this;
	}

	@Column(name = "team_id", unique = true, precision = 32)
	@Override
	public Integer getTeamId() {
		return this.teamId;
	}

	@Override
	public TeamAttributes setTeamId(Integer teamId) {
		this.teamId = teamId;
		return this;
	}

	@Column(name = "attributes")
	@Override
	public Object getAttributes() {
		return this.attributes;
	}

	@Override
	public TeamAttributes setAttributes(Object attributes) {
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
	public void from(ITeamAttributes from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setAttributes(from.getAttributes());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITeamAttributes> E into(E into) {
		into.from(this);
		return into;
	}
}
