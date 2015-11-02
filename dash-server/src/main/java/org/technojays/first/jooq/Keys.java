/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.technojays.first.jooq.tables.Alliance;
import org.technojays.first.jooq.tables.AllianceRef;
import org.technojays.first.jooq.tables.AllianceType;
import org.technojays.first.jooq.tables.Ally;
import org.technojays.first.jooq.tables.AttributeType;
import org.technojays.first.jooq.tables.Award;
import org.technojays.first.jooq.tables.AwardType;
import org.technojays.first.jooq.tables.Competition;
import org.technojays.first.jooq.tables.Event;
import org.technojays.first.jooq.tables.Game;
import org.technojays.first.jooq.tables.Location;
import org.technojays.first.jooq.tables.Match;
import org.technojays.first.jooq.tables.MatchScore;
import org.technojays.first.jooq.tables.Program;
import org.technojays.first.jooq.tables.ScoreType;
import org.technojays.first.jooq.tables.Sponsor;
import org.technojays.first.jooq.tables.Team;
import org.technojays.first.jooq.tables.TeamAttribute;
import org.technojays.first.jooq.tables.TeamScore;
import org.technojays.first.jooq.tables.TeamSponsor;
import org.technojays.first.jooq.tables.records.AllianceRecord;
import org.technojays.first.jooq.tables.records.AllianceRefRecord;
import org.technojays.first.jooq.tables.records.AllianceTypeRecord;
import org.technojays.first.jooq.tables.records.AllyRecord;
import org.technojays.first.jooq.tables.records.AttributeTypeRecord;
import org.technojays.first.jooq.tables.records.AwardRecord;
import org.technojays.first.jooq.tables.records.AwardTypeRecord;
import org.technojays.first.jooq.tables.records.CompetitionRecord;
import org.technojays.first.jooq.tables.records.EventRecord;
import org.technojays.first.jooq.tables.records.GameRecord;
import org.technojays.first.jooq.tables.records.LocationRecord;
import org.technojays.first.jooq.tables.records.MatchRecord;
import org.technojays.first.jooq.tables.records.MatchScoreRecord;
import org.technojays.first.jooq.tables.records.ProgramRecord;
import org.technojays.first.jooq.tables.records.ScoreTypeRecord;
import org.technojays.first.jooq.tables.records.SponsorRecord;
import org.technojays.first.jooq.tables.records.TeamAttributeRecord;
import org.technojays.first.jooq.tables.records.TeamRecord;
import org.technojays.first.jooq.tables.records.TeamScoreRecord;
import org.technojays.first.jooq.tables.records.TeamSponsorRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>first</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<AllianceRecord, Integer> IDENTITY_ALLIANCE = Identities0.IDENTITY_ALLIANCE;
	public static final Identity<AllianceRefRecord, Integer> IDENTITY_ALLIANCE_REF = Identities0.IDENTITY_ALLIANCE_REF;
	public static final Identity<AllianceTypeRecord, Integer> IDENTITY_ALLIANCE_TYPE = Identities0.IDENTITY_ALLIANCE_TYPE;
	public static final Identity<AllyRecord, Integer> IDENTITY_ALLY = Identities0.IDENTITY_ALLY;
	public static final Identity<AttributeTypeRecord, Integer> IDENTITY_ATTRIBUTE_TYPE = Identities0.IDENTITY_ATTRIBUTE_TYPE;
	public static final Identity<AwardRecord, Integer> IDENTITY_AWARD = Identities0.IDENTITY_AWARD;
	public static final Identity<AwardTypeRecord, Integer> IDENTITY_AWARD_TYPE = Identities0.IDENTITY_AWARD_TYPE;
	public static final Identity<CompetitionRecord, Integer> IDENTITY_COMPETITION = Identities0.IDENTITY_COMPETITION;
	public static final Identity<EventRecord, Integer> IDENTITY_EVENT = Identities0.IDENTITY_EVENT;
	public static final Identity<GameRecord, Integer> IDENTITY_GAME = Identities0.IDENTITY_GAME;
	public static final Identity<LocationRecord, Integer> IDENTITY_LOCATION = Identities0.IDENTITY_LOCATION;
	public static final Identity<MatchRecord, Integer> IDENTITY_MATCH = Identities0.IDENTITY_MATCH;
	public static final Identity<MatchScoreRecord, Integer> IDENTITY_MATCH_SCORE = Identities0.IDENTITY_MATCH_SCORE;
	public static final Identity<ProgramRecord, Integer> IDENTITY_PROGRAM = Identities0.IDENTITY_PROGRAM;
	public static final Identity<ScoreTypeRecord, Integer> IDENTITY_SCORE_TYPE = Identities0.IDENTITY_SCORE_TYPE;
	public static final Identity<SponsorRecord, Integer> IDENTITY_SPONSOR = Identities0.IDENTITY_SPONSOR;
	public static final Identity<TeamRecord, Integer> IDENTITY_TEAM = Identities0.IDENTITY_TEAM;
	public static final Identity<TeamAttributeRecord, Integer> IDENTITY_TEAM_ATTRIBUTE = Identities0.IDENTITY_TEAM_ATTRIBUTE;
	public static final Identity<TeamScoreRecord, Integer> IDENTITY_TEAM_SCORE = Identities0.IDENTITY_TEAM_SCORE;
	public static final Identity<TeamSponsorRecord, Integer> IDENTITY_TEAM_SPONSOR = Identities0.IDENTITY_TEAM_SPONSOR;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AllianceRecord> ALLIANCE_PK = UniqueKeys0.ALLIANCE_PK;
	public static final UniqueKey<AllianceRefRecord> ALLY_REF_PK = UniqueKeys0.ALLY_REF_PK;
	public static final UniqueKey<AllianceRefRecord> HASH_REF_UNIQ = UniqueKeys0.HASH_REF_UNIQ;
	public static final UniqueKey<AllianceTypeRecord> ALLIANCE_TYPE_PK = UniqueKeys0.ALLIANCE_TYPE_PK;
	public static final UniqueKey<AllianceTypeRecord> ALLIANCE_TYPE_SN_UNIQUE = UniqueKeys0.ALLIANCE_TYPE_SN_UNIQUE;
	public static final UniqueKey<AllyRecord> ALLIES_PK = UniqueKeys0.ALLIES_PK;
	public static final UniqueKey<AttributeTypeRecord> ATTRIBUTE_TYPE_PK = UniqueKeys0.ATTRIBUTE_TYPE_PK;
	public static final UniqueKey<AwardRecord> AWARDS_PK = UniqueKeys0.AWARDS_PK;
	public static final UniqueKey<AwardRecord> AWARDS_UNIQUENESS = UniqueKeys0.AWARDS_UNIQUENESS;
	public static final UniqueKey<AwardTypeRecord> AWARD_TYPE_PK = UniqueKeys0.AWARD_TYPE_PK;
	public static final UniqueKey<CompetitionRecord> COMPETITIONS_PK = UniqueKeys0.COMPETITIONS_PK;
	public static final UniqueKey<EventRecord> EVENTS_PK = UniqueKeys0.EVENTS_PK;
	public static final UniqueKey<EventRecord> EVENT_SHORT_NAME_UNIQUE = UniqueKeys0.EVENT_SHORT_NAME_UNIQUE;
	public static final UniqueKey<GameRecord> GAMES_PK = UniqueKeys0.GAMES_PK;
	public static final UniqueKey<GameRecord> GAMES_SHORT_NAME_UNIQUES = UniqueKeys0.GAMES_SHORT_NAME_UNIQUES;
	public static final UniqueKey<LocationRecord> LOCATIONS_PK = UniqueKeys0.LOCATIONS_PK;
	public static final UniqueKey<LocationRecord> PLACE_ID_UNIQUE = UniqueKeys0.PLACE_ID_UNIQUE;
	public static final UniqueKey<MatchRecord> MATCHES_PK = UniqueKeys0.MATCHES_PK;
	public static final UniqueKey<MatchRecord> MATCH_UNIQUENESS = UniqueKeys0.MATCH_UNIQUENESS;
	public static final UniqueKey<MatchScoreRecord> MATCH_SCORES_PK = UniqueKeys0.MATCH_SCORES_PK;
	public static final UniqueKey<MatchScoreRecord> MATCH_SCORE_UNIQUENESS = UniqueKeys0.MATCH_SCORE_UNIQUENESS;
	public static final UniqueKey<ProgramRecord> PROGRAMS_PK = UniqueKeys0.PROGRAMS_PK;
	public static final UniqueKey<ProgramRecord> PROGRAM_SHORT_NAME_UNIQUE = UniqueKeys0.PROGRAM_SHORT_NAME_UNIQUE;
	public static final UniqueKey<ScoreTypeRecord> MATCH_SCORE_TYPE_PK = UniqueKeys0.MATCH_SCORE_TYPE_PK;
	public static final UniqueKey<SponsorRecord> SPONSORS_PK = UniqueKeys0.SPONSORS_PK;
	public static final UniqueKey<TeamRecord> TEAMS_PK = UniqueKeys0.TEAMS_PK;
	public static final UniqueKey<TeamRecord> TEAMS_SN_UNIQUE = UniqueKeys0.TEAMS_SN_UNIQUE;
	public static final UniqueKey<TeamAttributeRecord> TEAM_ATTRIBUTES_PK = UniqueKeys0.TEAM_ATTRIBUTES_PK;
	public static final UniqueKey<TeamAttributeRecord> TEAM_ATTRIBUTE_UNIQUENESS = UniqueKeys0.TEAM_ATTRIBUTE_UNIQUENESS;
	public static final UniqueKey<TeamScoreRecord> TEAM_SCORES_PK = UniqueKeys0.TEAM_SCORES_PK;
	public static final UniqueKey<TeamScoreRecord> TEAM_SCORE_UNIQUENESS = UniqueKeys0.TEAM_SCORE_UNIQUENESS;
	public static final UniqueKey<TeamSponsorRecord> TEAM_SPONSORS_PK = UniqueKeys0.TEAM_SPONSORS_PK;
	public static final UniqueKey<TeamSponsorRecord> TEAM_SPONSOR_UNIQUENESS = UniqueKeys0.TEAM_SPONSOR_UNIQUENESS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<AllianceRecord, AllianceTypeRecord> ALLIANCE__ALLIANCES_TYPE_FK = ForeignKeys0.ALLIANCE__ALLIANCES_TYPE_FK;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<AllianceRecord, Integer> IDENTITY_ALLIANCE = createIdentity(Alliance.ALLIANCE, Alliance.ALLIANCE.ID);
		public static Identity<AllianceRefRecord, Integer> IDENTITY_ALLIANCE_REF = createIdentity(AllianceRef.ALLIANCE_REF, AllianceRef.ALLIANCE_REF.ID);
		public static Identity<AllianceTypeRecord, Integer> IDENTITY_ALLIANCE_TYPE = createIdentity(AllianceType.ALLIANCE_TYPE, AllianceType.ALLIANCE_TYPE.ID);
		public static Identity<AllyRecord, Integer> IDENTITY_ALLY = createIdentity(Ally.ALLY, Ally.ALLY.ID);
		public static Identity<AttributeTypeRecord, Integer> IDENTITY_ATTRIBUTE_TYPE = createIdentity(AttributeType.ATTRIBUTE_TYPE, AttributeType.ATTRIBUTE_TYPE.ID);
		public static Identity<AwardRecord, Integer> IDENTITY_AWARD = createIdentity(Award.AWARD, Award.AWARD.ID);
		public static Identity<AwardTypeRecord, Integer> IDENTITY_AWARD_TYPE = createIdentity(AwardType.AWARD_TYPE, AwardType.AWARD_TYPE.ID);
		public static Identity<CompetitionRecord, Integer> IDENTITY_COMPETITION = createIdentity(Competition.COMPETITION, Competition.COMPETITION.ID);
		public static Identity<EventRecord, Integer> IDENTITY_EVENT = createIdentity(Event.EVENT, Event.EVENT.ID);
		public static Identity<GameRecord, Integer> IDENTITY_GAME = createIdentity(Game.GAME, Game.GAME.ID);
		public static Identity<LocationRecord, Integer> IDENTITY_LOCATION = createIdentity(Location.LOCATION, Location.LOCATION.ID);
		public static Identity<MatchRecord, Integer> IDENTITY_MATCH = createIdentity(Match.MATCH, Match.MATCH.ID);
		public static Identity<MatchScoreRecord, Integer> IDENTITY_MATCH_SCORE = createIdentity(MatchScore.MATCH_SCORE, MatchScore.MATCH_SCORE.ID);
		public static Identity<ProgramRecord, Integer> IDENTITY_PROGRAM = createIdentity(Program.PROGRAM, Program.PROGRAM.ID);
		public static Identity<ScoreTypeRecord, Integer> IDENTITY_SCORE_TYPE = createIdentity(ScoreType.SCORE_TYPE, ScoreType.SCORE_TYPE.ID);
		public static Identity<SponsorRecord, Integer> IDENTITY_SPONSOR = createIdentity(Sponsor.SPONSOR, Sponsor.SPONSOR.ID);
		public static Identity<TeamRecord, Integer> IDENTITY_TEAM = createIdentity(Team.TEAM, Team.TEAM.ID);
		public static Identity<TeamAttributeRecord, Integer> IDENTITY_TEAM_ATTRIBUTE = createIdentity(TeamAttribute.TEAM_ATTRIBUTE, TeamAttribute.TEAM_ATTRIBUTE.ID);
		public static Identity<TeamScoreRecord, Integer> IDENTITY_TEAM_SCORE = createIdentity(TeamScore.TEAM_SCORE, TeamScore.TEAM_SCORE.ID);
		public static Identity<TeamSponsorRecord, Integer> IDENTITY_TEAM_SPONSOR = createIdentity(TeamSponsor.TEAM_SPONSOR, TeamSponsor.TEAM_SPONSOR.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AllianceRecord> ALLIANCE_PK = createUniqueKey(Alliance.ALLIANCE, Alliance.ALLIANCE.ID);
		public static final UniqueKey<AllianceRefRecord> ALLY_REF_PK = createUniqueKey(AllianceRef.ALLIANCE_REF, AllianceRef.ALLIANCE_REF.ID);
		public static final UniqueKey<AllianceRefRecord> HASH_REF_UNIQ = createUniqueKey(AllianceRef.ALLIANCE_REF, AllianceRef.ALLIANCE_REF.HASH_REF);
		public static final UniqueKey<AllianceTypeRecord> ALLIANCE_TYPE_PK = createUniqueKey(AllianceType.ALLIANCE_TYPE, AllianceType.ALLIANCE_TYPE.ID);
		public static final UniqueKey<AllianceTypeRecord> ALLIANCE_TYPE_SN_UNIQUE = createUniqueKey(AllianceType.ALLIANCE_TYPE, AllianceType.ALLIANCE_TYPE.SHORT_NAME);
		public static final UniqueKey<AllyRecord> ALLIES_PK = createUniqueKey(Ally.ALLY, Ally.ALLY.ID);
		public static final UniqueKey<AttributeTypeRecord> ATTRIBUTE_TYPE_PK = createUniqueKey(AttributeType.ATTRIBUTE_TYPE, AttributeType.ATTRIBUTE_TYPE.ID);
		public static final UniqueKey<AwardRecord> AWARDS_PK = createUniqueKey(Award.AWARD, Award.AWARD.ID);
		public static final UniqueKey<AwardRecord> AWARDS_UNIQUENESS = createUniqueKey(Award.AWARD, Award.AWARD.TYPE_ID, Award.AWARD.EVENT_ID, Award.AWARD.COMPETITION_ID, Award.AWARD.TEAM_ID);
		public static final UniqueKey<AwardTypeRecord> AWARD_TYPE_PK = createUniqueKey(AwardType.AWARD_TYPE, AwardType.AWARD_TYPE.ID);
		public static final UniqueKey<CompetitionRecord> COMPETITIONS_PK = createUniqueKey(Competition.COMPETITION, Competition.COMPETITION.ID);
		public static final UniqueKey<EventRecord> EVENTS_PK = createUniqueKey(Event.EVENT, Event.EVENT.ID);
		public static final UniqueKey<EventRecord> EVENT_SHORT_NAME_UNIQUE = createUniqueKey(Event.EVENT, Event.EVENT.SHORT_NAME);
		public static final UniqueKey<GameRecord> GAMES_PK = createUniqueKey(Game.GAME, Game.GAME.ID);
		public static final UniqueKey<GameRecord> GAMES_SHORT_NAME_UNIQUES = createUniqueKey(Game.GAME, Game.GAME.SHORT_NAME);
		public static final UniqueKey<LocationRecord> LOCATIONS_PK = createUniqueKey(Location.LOCATION, Location.LOCATION.ID);
		public static final UniqueKey<LocationRecord> PLACE_ID_UNIQUE = createUniqueKey(Location.LOCATION, Location.LOCATION.PLACE_ID);
		public static final UniqueKey<MatchRecord> MATCHES_PK = createUniqueKey(Match.MATCH, Match.MATCH.ID);
		public static final UniqueKey<MatchRecord> MATCH_UNIQUENESS = createUniqueKey(Match.MATCH, Match.MATCH.COMPETITION_ID, Match.MATCH.MATCH_NUMBER);
		public static final UniqueKey<MatchScoreRecord> MATCH_SCORES_PK = createUniqueKey(MatchScore.MATCH_SCORE, MatchScore.MATCH_SCORE.ID);
		public static final UniqueKey<MatchScoreRecord> MATCH_SCORE_UNIQUENESS = createUniqueKey(MatchScore.MATCH_SCORE, MatchScore.MATCH_SCORE.MATCH_ID, MatchScore.MATCH_SCORE.ALLIANCE_ID, MatchScore.MATCH_SCORE.SCORE_TYPE_ID);
		public static final UniqueKey<ProgramRecord> PROGRAMS_PK = createUniqueKey(Program.PROGRAM, Program.PROGRAM.ID);
		public static final UniqueKey<ProgramRecord> PROGRAM_SHORT_NAME_UNIQUE = createUniqueKey(Program.PROGRAM, Program.PROGRAM.SHORT_NAME);
		public static final UniqueKey<ScoreTypeRecord> MATCH_SCORE_TYPE_PK = createUniqueKey(ScoreType.SCORE_TYPE, ScoreType.SCORE_TYPE.ID);
		public static final UniqueKey<SponsorRecord> SPONSORS_PK = createUniqueKey(Sponsor.SPONSOR, Sponsor.SPONSOR.ID);
		public static final UniqueKey<TeamRecord> TEAMS_PK = createUniqueKey(Team.TEAM, Team.TEAM.ID);
		public static final UniqueKey<TeamRecord> TEAMS_SN_UNIQUE = createUniqueKey(Team.TEAM, Team.TEAM.SHORT_NAME);
		public static final UniqueKey<TeamAttributeRecord> TEAM_ATTRIBUTES_PK = createUniqueKey(TeamAttribute.TEAM_ATTRIBUTE, TeamAttribute.TEAM_ATTRIBUTE.ID);
		public static final UniqueKey<TeamAttributeRecord> TEAM_ATTRIBUTE_UNIQUENESS = createUniqueKey(TeamAttribute.TEAM_ATTRIBUTE, TeamAttribute.TEAM_ATTRIBUTE.TEAM_ID);
		public static final UniqueKey<TeamScoreRecord> TEAM_SCORES_PK = createUniqueKey(TeamScore.TEAM_SCORE, TeamScore.TEAM_SCORE.ID);
		public static final UniqueKey<TeamScoreRecord> TEAM_SCORE_UNIQUENESS = createUniqueKey(TeamScore.TEAM_SCORE, TeamScore.TEAM_SCORE.TEAM_ID, TeamScore.TEAM_SCORE.MATCH_ID, TeamScore.TEAM_SCORE.SCORE_TYPE_ID);
		public static final UniqueKey<TeamSponsorRecord> TEAM_SPONSORS_PK = createUniqueKey(TeamSponsor.TEAM_SPONSOR, TeamSponsor.TEAM_SPONSOR.ID);
		public static final UniqueKey<TeamSponsorRecord> TEAM_SPONSOR_UNIQUENESS = createUniqueKey(TeamSponsor.TEAM_SPONSOR, TeamSponsor.TEAM_SPONSOR.TEAM_ID, TeamSponsor.TEAM_SPONSOR.SPONSOR_ID, TeamSponsor.TEAM_SPONSOR.GAME_ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<AllianceRecord, AllianceTypeRecord> ALLIANCE__ALLIANCES_TYPE_FK = createForeignKey(org.technojays.first.jooq.Keys.ALLIANCE_TYPE_PK, Alliance.ALLIANCE, Alliance.ALLIANCE.TYPE);
	}
}