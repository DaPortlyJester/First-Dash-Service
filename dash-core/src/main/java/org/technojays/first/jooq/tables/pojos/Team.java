/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * A team associated with a specific FIRST program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Team implements Serializable {

	private static final long serialVersionUID = 1242043497;

	private Integer id;
	private Integer programId;
	private Integer number;
	private String  name;
	private String  shortName;

	public Team() {}

	public Team(Team value) {
		this.id = value.id;
		this.programId = value.programId;
		this.number = value.number;
		this.name = value.name;
		this.shortName = value.shortName;
	}

	public Team(
		Integer id,
		Integer programId,
		Integer number,
		String  name,
		String  shortName
	) {
		this.id = id;
		this.programId = programId;
		this.number = number;
		this.name = name;
		this.shortName = shortName;
	}

	public Integer getId() {
		return this.id;
	}

	public Team setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public Team setProgramId(Integer programId) {
		this.programId = programId;
		return this;
	}

	public Integer getNumber() {
		return this.number;
	}

	public Team setNumber(Integer number) {
		this.number = number;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public Team setName(String name) {
		this.name = name;
		return this;
	}

	public String getShortName() {
		return this.shortName;
	}

	public Team setShortName(String shortName) {
		this.shortName = shortName;
		return this;
	}
}
