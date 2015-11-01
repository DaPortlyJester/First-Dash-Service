/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.technojays.jooq.First;
import org.technojays.jooq.Keys;
import org.technojays.jooq.tables.records.TeamScoresRecord;


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
public class TeamScores extends TableImpl<TeamScoresRecord> {

	private static final long serialVersionUID = -149398765;

	/**
	 * The reference instance of <code>first.team_scores</code>
	 */
	public static final TeamScores TEAM_SCORES = new TeamScores();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TeamScoresRecord> getRecordType() {
		return TeamScoresRecord.class;
	}

	/**
	 * The column <code>first.team_scores.id</code>. system id for this score
	 */
	public final TableField<TeamScoresRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "system id for this score");

	/**
	 * The column <code>first.team_scores.team_id</code>. system id for the associated team
	 */
	public final TableField<TeamScoresRecord, Integer> TEAM_ID = createField("team_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated team");

	/**
	 * The column <code>first.team_scores.match_id</code>. system id for the associated match
	 */
	public final TableField<TeamScoresRecord, Integer> MATCH_ID = createField("match_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated match");

	/**
	 * The column <code>first.team_scores.score_type_id</code>. system id for the associated score type
	 */
	public final TableField<TeamScoresRecord, Integer> SCORE_TYPE_ID = createField("score_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated score type");

	/**
	 * The column <code>first.team_scores.value</code>. score value
	 */
	public final TableField<TeamScoresRecord, String[]> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "score value");

	/**
	 * Create a <code>first.team_scores</code> table reference
	 */
	public TeamScores() {
		this("team_scores", null);
	}

	/**
	 * Create an aliased <code>first.team_scores</code> table reference
	 */
	public TeamScores(String alias) {
		this(alias, TEAM_SCORES);
	}

	private TeamScores(String alias, Table<TeamScoresRecord> aliased) {
		this(alias, aliased, null);
	}

	private TeamScores(String alias, Table<TeamScoresRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Scores associated with a FIRST team during a match at a competition\n");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TeamScoresRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TEAM_SCORES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TeamScoresRecord> getPrimaryKey() {
		return Keys.TEAM_SCORES_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TeamScoresRecord>> getKeys() {
		return Arrays.<UniqueKey<TeamScoresRecord>>asList(Keys.TEAM_SCORES_PK, Keys.TEAM_SCORE_UNIQUENESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamScores as(String alias) {
		return new TeamScores(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TeamScores rename(String name) {
		return new TeamScores(name, null);
	}
}
