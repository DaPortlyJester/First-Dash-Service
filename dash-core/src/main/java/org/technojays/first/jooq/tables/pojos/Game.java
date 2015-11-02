/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * A game describes a specific set of rules and competitions for a program 
 * and its teams. It has a period of time 
 * associated with it.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Game implements Serializable {

	private static final long serialVersionUID = -426038676;

	private Integer   id;
	private String    name;
	private String[]  shortName;
	private Integer   programId;
	private Timestamp startDate;
	private Timestamp endDate;

	public Game() {}

	public Game(Game value) {
		this.id = value.id;
		this.name = value.name;
		this.shortName = value.shortName;
		this.programId = value.programId;
		this.startDate = value.startDate;
		this.endDate = value.endDate;
	}

	public Game(
		Integer   id,
		String    name,
		String[]  shortName,
		Integer   programId,
		Timestamp startDate,
		Timestamp endDate
	) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.programId = programId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getId() {
		return this.id;
	}

	public Game setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public Game setName(String name) {
		this.name = name;
		return this;
	}

	public String[] getShortName() {
		return this.shortName;
	}

	public Game setShortName(String[] shortName) {
		this.shortName = shortName;
		return this;
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public Game setProgramId(Integer programId) {
		this.programId = programId;
		return this;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public Game setStartDate(Timestamp startDate) {
		this.startDate = startDate;
		return this;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public Game setEndDate(Timestamp endDate) {
		this.endDate = endDate;
		return this;
	}
}
