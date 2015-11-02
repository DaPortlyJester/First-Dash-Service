/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Describe a match where teams competed against each other
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Match implements Serializable {

	private static final long serialVersionUID = -1291294839;

	private Integer   id;
	private Integer   matchNumber;
	private Integer   competitionId;
	private Timestamp startTime;
	private Timestamp endTime;

	public Match() {}

	public Match(Match value) {
		this.id = value.id;
		this.matchNumber = value.matchNumber;
		this.competitionId = value.competitionId;
		this.startTime = value.startTime;
		this.endTime = value.endTime;
	}

	public Match(
		Integer   id,
		Integer   matchNumber,
		Integer   competitionId,
		Timestamp startTime,
		Timestamp endTime
	) {
		this.id = id;
		this.matchNumber = matchNumber;
		this.competitionId = competitionId;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Integer getId() {
		return this.id;
	}

	public Match setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getMatchNumber() {
		return this.matchNumber;
	}

	public Match setMatchNumber(Integer matchNumber) {
		this.matchNumber = matchNumber;
		return this;
	}

	public Integer getCompetitionId() {
		return this.competitionId;
	}

	public Match setCompetitionId(Integer competitionId) {
		this.competitionId = competitionId;
		return this;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public Match setStartTime(Timestamp startTime) {
		this.startTime = startTime;
		return this;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public Match setEndTime(Timestamp endTime) {
		this.endTime = endTime;
		return this;
	}
}