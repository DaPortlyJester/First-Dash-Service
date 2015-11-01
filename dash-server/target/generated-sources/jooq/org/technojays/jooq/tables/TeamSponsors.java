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
import org.technojays.jooq.tables.records.TeamSponsorsRecord;


/**
 * Sponsors associated with a FIRST team for a given game (season)
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamSponsors extends TableImpl<TeamSponsorsRecord> {

	private static final long serialVersionUID = 367189631;

	/**
	 * The reference instance of <code>first.team_sponsors</code>
	 */
	public static final TeamSponsors TEAM_SPONSORS = new TeamSponsors();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TeamSponsorsRecord> getRecordType() {
		return TeamSponsorsRecord.class;
	}

	/**
	 * The column <code>first.team_sponsors.id</code>. system id for this team sponsor
	 */
	public final TableField<TeamSponsorsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "system id for this team sponsor");

	/**
	 * The column <code>first.team_sponsors.team_id</code>. system id for the associated
	 */
	public final TableField<TeamSponsorsRecord, Integer> TEAM_ID = createField("team_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated");

	/**
	 * The column <code>first.team_sponsors.sponsor_id</code>. system id for the associated sponsor
	 */
	public final TableField<TeamSponsorsRecord, Integer> SPONSOR_ID = createField("sponsor_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated sponsor");

	/**
	 * The column <code>first.team_sponsors.game_id</code>. system id for the associated game
	 */
	public final TableField<TeamSponsorsRecord, Integer> GAME_ID = createField("game_id", org.jooq.impl.SQLDataType.INTEGER, this, "system id for the associated game");

	/**
	 * Create a <code>first.team_sponsors</code> table reference
	 */
	public TeamSponsors() {
		this("team_sponsors", null);
	}

	/**
	 * Create an aliased <code>first.team_sponsors</code> table reference
	 */
	public TeamSponsors(String alias) {
		this(alias, TEAM_SPONSORS);
	}

	private TeamSponsors(String alias, Table<TeamSponsorsRecord> aliased) {
		this(alias, aliased, null);
	}

	private TeamSponsors(String alias, Table<TeamSponsorsRecord> aliased, Field<?>[] parameters) {
		super(alias, First.FIRST, aliased, parameters, "Sponsors associated with a FIRST team for a given game (season)");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TeamSponsorsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TEAM_SPONSORS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TeamSponsorsRecord> getPrimaryKey() {
		return Keys.TEAM_SPONSORS_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TeamSponsorsRecord>> getKeys() {
		return Arrays.<UniqueKey<TeamSponsorsRecord>>asList(Keys.TEAM_SPONSORS_PK, Keys.TEAM_SPONSOR_UNIQUENESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TeamSponsors as(String alias) {
		return new TeamSponsors(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TeamSponsors rename(String name) {
		return new TeamSponsors(name, null);
	}
}
