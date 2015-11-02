/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.technojays.first.jooq.tables.interfaces.IAlly;


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
@Entity
@Table(name = "ally", schema = "first")
public class Ally implements IAlly {

	private static final long serialVersionUID = -223736860;

	private Integer  id;
	private Integer  teamId;
	private String[] allyRef;

	public Ally() {}

	public Ally(Ally value) {
		this.id = value.id;
		this.teamId = value.teamId;
		this.allyRef = value.allyRef;
	}

	public Ally(
		Integer  id,
		Integer  teamId,
		String[] allyRef
	) {
		this.id = id;
		this.teamId = teamId;
		this.allyRef = allyRef;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Ally setId(Integer id) {
		this.id = id;
		return this;
	}

	@Column(name = "team_id", precision = 32)
	@Override
	public Integer getTeamId() {
		return this.teamId;
	}

	@Override
	public Ally setTeamId(Integer teamId) {
		this.teamId = teamId;
		return this;
	}

	@Column(name = "ally_ref")
	@Override
	public String[] getAllyRef() {
		return this.allyRef;
	}

	@Override
	public Ally setAllyRef(String[] allyRef) {
		this.allyRef = allyRef;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IAlly from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setAllyRef(from.getAllyRef());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IAlly> E into(E into) {
		into.from(this);
		return into;
	}
}
