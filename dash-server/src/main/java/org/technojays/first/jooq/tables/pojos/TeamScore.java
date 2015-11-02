/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.technojays.first.jooq.tables.interfaces.ITeamScore;


/**
 * Scores associated with a FIRST team during a match at a competition
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
@Table(name = "team_score", schema = "first", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"team_id", "match_id", "score_type_id"})
})
public class TeamScore implements ITeamScore {

	private static final long serialVersionUID = -1728176480;

	private Integer  id;
	private Integer  teamId;
	private Integer  matchId;
	private Integer  scoreTypeId;
	private String[] value;

	public TeamScore() {}

	public TeamScore(TeamScore value) {
		this.id = value.id;
		this.teamId = value.teamId;
		this.matchId = value.matchId;
		this.scoreTypeId = value.scoreTypeId;
		this.value = value.value;
	}

	public TeamScore(
		Integer  id,
		Integer  teamId,
		Integer  matchId,
		Integer  scoreTypeId,
		String[] value
	) {
		this.id = id;
		this.teamId = teamId;
		this.matchId = matchId;
		this.scoreTypeId = scoreTypeId;
		this.value = value;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public TeamScore setId(Integer id) {
		this.id = id;
		return this;
	}

	@Column(name = "team_id", precision = 32)
	@Override
	public Integer getTeamId() {
		return this.teamId;
	}

	@Override
	public TeamScore setTeamId(Integer teamId) {
		this.teamId = teamId;
		return this;
	}

	@Column(name = "match_id", precision = 32)
	@Override
	public Integer getMatchId() {
		return this.matchId;
	}

	@Override
	public TeamScore setMatchId(Integer matchId) {
		this.matchId = matchId;
		return this;
	}

	@Column(name = "score_type_id", precision = 32)
	@Override
	public Integer getScoreTypeId() {
		return this.scoreTypeId;
	}

	@Override
	public TeamScore setScoreTypeId(Integer scoreTypeId) {
		this.scoreTypeId = scoreTypeId;
		return this;
	}

	@Column(name = "value")
	@Override
	public String[] getValue() {
		return this.value;
	}

	@Override
	public TeamScore setValue(String[] value) {
		this.value = value;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITeamScore from) {
		setId(from.getId());
		setTeamId(from.getTeamId());
		setMatchId(from.getMatchId());
		setScoreTypeId(from.getScoreTypeId());
		setValue(from.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITeamScore> E into(E into) {
		into.from(this);
		return into;
	}
}
