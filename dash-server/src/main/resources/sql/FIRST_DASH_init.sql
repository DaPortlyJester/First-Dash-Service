--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.4
-- Dumped by pg_dump version 9.4.0
-- Started on 2015-07-17 22:05:23

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

DROP DATABASE first_dash;
--
-- TOC entry 2370 (class 1262 OID 16395)
-- Name: first_dash; Type: DATABASE; Schema: -; Owner: tj_admin
--

CREATE DATABASE first_dash WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';


ALTER DATABASE first_dash OWNER TO tj_admin;

\connect first_dash

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 2371 (class 1262 OID 16395)
-- Dependencies: 2370
-- Name: first_dash; Type: COMMENT; Schema: -; Owner: tj_admin
--

COMMENT ON DATABASE first_dash IS 'FIRST Dash Service Database';


--
-- TOC entry 7 (class 2615 OID 24809)
-- Name: first; Type: SCHEMA; Schema: -; Owner: tj_admin
--

CREATE SCHEMA first;


ALTER SCHEMA first OWNER TO tj_admin;

--
-- TOC entry 2372 (class 0 OID 0)
-- Dependencies: 7
-- Name: SCHEMA first; Type: COMMENT; Schema: -; Owner: tj_admin
--

COMMENT ON SCHEMA first IS 'FIRST Schema';


--
-- TOC entry 5 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 2373 (class 0 OID 0)
-- Dependencies: 5
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 211 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2375 (class 0 OID 0)
-- Dependencies: 211
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 213 (class 3079 OID 24957)
-- Name: cube; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS cube WITH SCHEMA public;


--
-- TOC entry 2376 (class 0 OID 0)
-- Dependencies: 213
-- Name: EXTENSION cube; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION cube IS 'data type for multidimensional cubes';


--
-- TOC entry 212 (class 3079 OID 25029)
-- Name: earthdistance; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS earthdistance WITH SCHEMA public;


--
-- TOC entry 2377 (class 0 OID 0)
-- Dependencies: 212
-- Name: EXTENSION earthdistance; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION earthdistance IS 'calculate great-circle distances on the surface of the Earth';


--
-- TOC entry 214 (class 3079 OID 24662)
-- Name: hstore; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS hstore WITH SCHEMA public;


--
-- TOC entry 2378 (class 0 OID 0)
-- Dependencies: 214
-- Name: EXTENSION hstore; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION hstore IS 'data type for storing sets of (key, value) pairs';


SET search_path = first, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 174 (class 1259 OID 24812)
-- Name: alliance_types; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE alliance_types (
    id integer NOT NULL,
    name text,
    short_name character varying(32)[]
);


ALTER TABLE alliance_types OWNER TO tj_admin;

--
-- TOC entry 2379 (class 0 OID 0)
-- Dependencies: 174
-- Name: TABLE alliance_types; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE alliance_types IS 'Alliance types for FIRST programs';


--
-- TOC entry 2380 (class 0 OID 0)
-- Dependencies: 174
-- Name: COLUMN alliance_types.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliance_types.id IS 'System id for alliance type';


--
-- TOC entry 2381 (class 0 OID 0)
-- Dependencies: 174
-- Name: COLUMN alliance_types.name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliance_types.name IS 'Name for alliance type';


--
-- TOC entry 2382 (class 0 OID 0)
-- Dependencies: 174
-- Name: COLUMN alliance_types.short_name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliance_types.short_name IS 'Short Name for alliance type';


--
-- TOC entry 173 (class 1259 OID 24810)
-- Name: alliance_types_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE alliance_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE alliance_types_id_seq OWNER TO tj_admin;

--
-- TOC entry 2383 (class 0 OID 0)
-- Dependencies: 173
-- Name: alliance_types_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE alliance_types_id_seq OWNED BY alliance_types.id;


--
-- TOC entry 176 (class 1259 OID 24821)
-- Name: alliances; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE alliances (
    id integer NOT NULL,
    type integer,
    match_id integer,
    ally_ref character varying(64)[]
);


ALTER TABLE alliances OWNER TO tj_admin;

--
-- TOC entry 2384 (class 0 OID 0)
-- Dependencies: 176
-- Name: TABLE alliances; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE alliances IS 'Relationship between a match and a group of allies';


--
-- TOC entry 2385 (class 0 OID 0)
-- Dependencies: 176
-- Name: COLUMN alliances.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliances.id IS 'system id for this alliance';


--
-- TOC entry 2386 (class 0 OID 0)
-- Dependencies: 176
-- Name: COLUMN alliances.type; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliances.type IS 'type (color) for this alliance';


--
-- TOC entry 2387 (class 0 OID 0)
-- Dependencies: 176
-- Name: COLUMN alliances.match_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliances.match_id IS 'system id for the associated match';


--
-- TOC entry 2388 (class 0 OID 0)
-- Dependencies: 176
-- Name: COLUMN alliances.ally_ref; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN alliances.ally_ref IS 'ally->alliance reference for all teams that were a part of this alliance (sha from team numbers)';


--
-- TOC entry 175 (class 1259 OID 24819)
-- Name: alliances_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE alliances_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE alliances_id_seq OWNER TO tj_admin;

--
-- TOC entry 2389 (class 0 OID 0)
-- Dependencies: 175
-- Name: alliances_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE alliances_id_seq OWNED BY alliances.id;


--
-- TOC entry 178 (class 1259 OID 24830)
-- Name: allies; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE allies (
    id integer NOT NULL,
    team_id integer,
    ally_ref character varying(64)[]
);


ALTER TABLE allies OWNER TO tj_admin;

--
-- TOC entry 2390 (class 0 OID 0)
-- Dependencies: 178
-- Name: TABLE allies; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE allies IS 'Relationship between a set of teams for an alliance';


--
-- TOC entry 177 (class 1259 OID 24828)
-- Name: allies_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE allies_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE allies_id_seq OWNER TO tj_admin;

--
-- TOC entry 2391 (class 0 OID 0)
-- Dependencies: 177
-- Name: allies_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE allies_id_seq OWNED BY allies.id;


--
-- TOC entry 180 (class 1259 OID 24839)
-- Name: attribute_types; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE attribute_types (
    id integer NOT NULL,
    info public.hstore
);


ALTER TABLE attribute_types OWNER TO tj_admin;

--
-- TOC entry 2392 (class 0 OID 0)
-- Dependencies: 180
-- Name: TABLE attribute_types; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE attribute_types IS 'Attribute types in program';


--
-- TOC entry 2393 (class 0 OID 0)
-- Dependencies: 180
-- Name: COLUMN attribute_types.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN attribute_types.id IS 'system id for this attribute type';


--
-- TOC entry 2394 (class 0 OID 0)
-- Dependencies: 180
-- Name: COLUMN attribute_types.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN attribute_types.info IS 'info for this attribute type';


--
-- TOC entry 179 (class 1259 OID 24837)
-- Name: attribute_types_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE attribute_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE attribute_types_id_seq OWNER TO tj_admin;

--
-- TOC entry 2395 (class 0 OID 0)
-- Dependencies: 179
-- Name: attribute_types_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE attribute_types_id_seq OWNED BY attribute_types.id;


--
-- TOC entry 182 (class 1259 OID 24848)
-- Name: award_type; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE award_type (
    id integer NOT NULL,
    info public.hstore
);


ALTER TABLE award_type OWNER TO tj_admin;

--
-- TOC entry 2396 (class 0 OID 0)
-- Dependencies: 182
-- Name: TABLE award_type; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE award_type IS 'Award types';


--
-- TOC entry 2397 (class 0 OID 0)
-- Dependencies: 182
-- Name: COLUMN award_type.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN award_type.info IS 'award type info';


--
-- TOC entry 181 (class 1259 OID 24846)
-- Name: award_type_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE award_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE award_type_id_seq OWNER TO tj_admin;

--
-- TOC entry 2398 (class 0 OID 0)
-- Dependencies: 181
-- Name: award_type_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE award_type_id_seq OWNED BY award_type.id;


--
-- TOC entry 184 (class 1259 OID 24857)
-- Name: awards; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE awards (
    id integer NOT NULL,
    type_id integer,
    event_id integer,
    competition_id integer,
    team_id integer,
    awardee_id integer
);


ALTER TABLE awards OWNER TO tj_admin;

--
-- TOC entry 2399 (class 0 OID 0)
-- Dependencies: 184
-- Name: TABLE awards; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE awards IS 'Awards awarded at competitions and events';


--
-- TOC entry 2400 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.id IS 'system id for this award';


--
-- TOC entry 2401 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.type_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.type_id IS 'system id for the type of this award';


--
-- TOC entry 2402 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.event_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.event_id IS 'system id for the associated event';


--
-- TOC entry 2403 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.competition_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.competition_id IS 'system id for the competition this award is assocaited with';


--
-- TOC entry 2404 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.team_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.team_id IS 'system id for the team this award is associated with';


--
-- TOC entry 2405 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN awards.awardee_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN awards.awardee_id IS 'system id for the awardee of this award';


--
-- TOC entry 183 (class 1259 OID 24855)
-- Name: awards_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE awards_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE awards_id_seq OWNER TO tj_admin;

--
-- TOC entry 2406 (class 0 OID 0)
-- Dependencies: 183
-- Name: awards_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE awards_id_seq OWNED BY awards.id;


--
-- TOC entry 186 (class 1259 OID 24863)
-- Name: competitions; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE competitions (
    id integer NOT NULL,
    name text,
    type_id integer,
    event_id integer,
    location_id integer,
    game_id integer
);


ALTER TABLE competitions OWNER TO tj_admin;

--
-- TOC entry 2407 (class 0 OID 0)
-- Dependencies: 186
-- Name: TABLE competitions; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE competitions IS 'A competition describes a Location, Game, and is held at an Event';


--
-- TOC entry 2408 (class 0 OID 0)
-- Dependencies: 186
-- Name: COLUMN competitions.type_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN competitions.type_id IS 'comptetion type id';


--
-- TOC entry 185 (class 1259 OID 24861)
-- Name: competitions_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE competitions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE competitions_id_seq OWNER TO tj_admin;

--
-- TOC entry 2409 (class 0 OID 0)
-- Dependencies: 185
-- Name: competitions_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE competitions_id_seq OWNED BY competitions.id;


--
-- TOC entry 188 (class 1259 OID 24872)
-- Name: events; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE events (
    id integer NOT NULL,
    name text,
    short_name character varying(64)[],
    start_date timestamp with time zone,
    end_date timestamp with time zone,
    info public.hstore
);


ALTER TABLE events OWNER TO tj_admin;

--
-- TOC entry 2410 (class 0 OID 0)
-- Dependencies: 188
-- Name: TABLE events; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE events IS 'An event describes the timeframe for competitions and celebrations that are managed together
';


--
-- TOC entry 2411 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.id IS 'event system id';


--
-- TOC entry 2412 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.name IS 'display name for event';


--
-- TOC entry 2413 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.short_name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.short_name IS 'Short name for event';


--
-- TOC entry 2414 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.start_date; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.start_date IS 'start date of event';


--
-- TOC entry 2415 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.end_date; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.end_date IS 'end date of event';


--
-- TOC entry 2416 (class 0 OID 0)
-- Dependencies: 188
-- Name: COLUMN events.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN events.info IS 'event info';


--
-- TOC entry 187 (class 1259 OID 24870)
-- Name: events_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE events_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE events_id_seq OWNER TO tj_admin;

--
-- TOC entry 2417 (class 0 OID 0)
-- Dependencies: 187
-- Name: events_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE events_id_seq OWNED BY events.id;


--
-- TOC entry 190 (class 1259 OID 24881)
-- Name: games; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE games (
    id integer NOT NULL,
    name text,
    short_name character varying(64)[],
    program_id integer,
    start_date timestamp with time zone,
    end_date timestamp with time zone
);


ALTER TABLE games OWNER TO tj_admin;

--
-- TOC entry 2418 (class 0 OID 0)
-- Dependencies: 190
-- Name: TABLE games; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE games IS 'A game describes a specific set of rules and competitions for a program and its teams. It has a period of time
associated with it.';


--
-- TOC entry 2419 (class 0 OID 0)
-- Dependencies: 190
-- Name: COLUMN games.program_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN games.program_id IS 'system id of associated program';


--
-- TOC entry 2420 (class 0 OID 0)
-- Dependencies: 190
-- Name: COLUMN games.start_date; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN games.start_date IS 'Game start date';


--
-- TOC entry 2421 (class 0 OID 0)
-- Dependencies: 190
-- Name: COLUMN games.end_date; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN games.end_date IS 'end date of season';


--
-- TOC entry 189 (class 1259 OID 24879)
-- Name: games_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE games_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE games_id_seq OWNER TO tj_admin;

--
-- TOC entry 2422 (class 0 OID 0)
-- Dependencies: 189
-- Name: games_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE games_id_seq OWNED BY games.id;


--
-- TOC entry 192 (class 1259 OID 24890)
-- Name: locations; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE locations (
    id integer NOT NULL,
    lng double precision,
    lat double precision,
    place_id integer
);


ALTER TABLE locations OWNER TO tj_admin;

--
-- TOC entry 2423 (class 0 OID 0)
-- Dependencies: 192
-- Name: TABLE locations; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE locations IS 'Locations for program';


--
-- TOC entry 2424 (class 0 OID 0)
-- Dependencies: 192
-- Name: COLUMN locations.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN locations.id IS 'location system id';


--
-- TOC entry 191 (class 1259 OID 24888)
-- Name: locations_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE locations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE locations_id_seq OWNER TO tj_admin;

--
-- TOC entry 2425 (class 0 OID 0)
-- Dependencies: 191
-- Name: locations_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE locations_id_seq OWNED BY locations.id;


--
-- TOC entry 200 (class 1259 OID 25057)
-- Name: match_scores; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE match_scores (
    id integer NOT NULL,
    match_id integer,
    alliance_id integer,
    score_type_id integer,
    value character varying(64)[]
);


ALTER TABLE match_scores OWNER TO tj_admin;

--
-- TOC entry 2426 (class 0 OID 0)
-- Dependencies: 200
-- Name: TABLE match_scores; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE match_scores IS 'Scores associated with a match';


--
-- TOC entry 2427 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN match_scores.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN match_scores.id IS 'system id for this match';


--
-- TOC entry 2428 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN match_scores.match_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN match_scores.match_id IS 'system id of the associated match';


--
-- TOC entry 2429 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN match_scores.alliance_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN match_scores.alliance_id IS 'system id of the associated alliance';


--
-- TOC entry 2430 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN match_scores.score_type_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN match_scores.score_type_id IS 'system id of the score type';


--
-- TOC entry 2431 (class 0 OID 0)
-- Dependencies: 200
-- Name: COLUMN match_scores.value; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN match_scores.value IS 'score value';


--
-- TOC entry 199 (class 1259 OID 25055)
-- Name: match_scores_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE match_scores_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE match_scores_id_seq OWNER TO tj_admin;

--
-- TOC entry 2432 (class 0 OID 0)
-- Dependencies: 199
-- Name: match_scores_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE match_scores_id_seq OWNED BY match_scores.id;


--
-- TOC entry 198 (class 1259 OID 25047)
-- Name: matches; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE matches (
    id integer NOT NULL,
    match_number integer,
    competition_id integer,
    start_time timestamp with time zone,
    end_time timestamp with time zone
);


ALTER TABLE matches OWNER TO tj_admin;

--
-- TOC entry 2433 (class 0 OID 0)
-- Dependencies: 198
-- Name: TABLE matches; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE matches IS 'Describe a match where teams competed against each other
';


--
-- TOC entry 2434 (class 0 OID 0)
-- Dependencies: 198
-- Name: COLUMN matches.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN matches.id IS 'system id for this match';


--
-- TOC entry 2435 (class 0 OID 0)
-- Dependencies: 198
-- Name: COLUMN matches.match_number; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN matches.match_number IS 'match number for the competition';


--
-- TOC entry 2436 (class 0 OID 0)
-- Dependencies: 198
-- Name: COLUMN matches.competition_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN matches.competition_id IS 'competition system id';


--
-- TOC entry 2437 (class 0 OID 0)
-- Dependencies: 198
-- Name: COLUMN matches.start_time; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN matches.start_time IS ' expected match start time';


--
-- TOC entry 2438 (class 0 OID 0)
-- Dependencies: 198
-- Name: COLUMN matches.end_time; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN matches.end_time IS 'expected match end time';


--
-- TOC entry 197 (class 1259 OID 25045)
-- Name: matches_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE matches_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE matches_id_seq OWNER TO tj_admin;

--
-- TOC entry 2439 (class 0 OID 0)
-- Dependencies: 197
-- Name: matches_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE matches_id_seq OWNED BY matches.id;


--
-- TOC entry 194 (class 1259 OID 24896)
-- Name: programs; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE programs (
    id integer NOT NULL,
    name text,
    short_name character varying(16)[],
    membership character varying(16)[],
    info public.hstore
);


ALTER TABLE programs OWNER TO tj_admin;

--
-- TOC entry 2440 (class 0 OID 0)
-- Dependencies: 194
-- Name: TABLE programs; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE programs IS 'A program is a sub-organization of FIRST that describes the type of games that will be played and the
types of participants.';


--
-- TOC entry 2441 (class 0 OID 0)
-- Dependencies: 194
-- Name: COLUMN programs.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN programs.id IS 'system id for this program';


--
-- TOC entry 2442 (class 0 OID 0)
-- Dependencies: 194
-- Name: COLUMN programs.name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN programs.name IS 'Display name for this program';


--
-- TOC entry 2443 (class 0 OID 0)
-- Dependencies: 194
-- Name: COLUMN programs.short_name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN programs.short_name IS 'symbolic / abbreviate name used in program searches';


--
-- TOC entry 2444 (class 0 OID 0)
-- Dependencies: 194
-- Name: COLUMN programs.membership; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN programs.membership IS 'Student body participation in this program';


--
-- TOC entry 2445 (class 0 OID 0)
-- Dependencies: 194
-- Name: COLUMN programs.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN programs.info IS 'Info for this program';


--
-- TOC entry 193 (class 1259 OID 24894)
-- Name: programs_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE programs_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE programs_id_seq OWNER TO tj_admin;

--
-- TOC entry 2446 (class 0 OID 0)
-- Dependencies: 193
-- Name: programs_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE programs_id_seq OWNED BY programs.id;


--
-- TOC entry 202 (class 1259 OID 25070)
-- Name: score_types; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE score_types (
    id integer NOT NULL,
    info public.hstore
);


ALTER TABLE score_types OWNER TO tj_admin;

--
-- TOC entry 2447 (class 0 OID 0)
-- Dependencies: 202
-- Name: TABLE score_types; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE score_types IS 'Types of scores associated with matches';


--
-- TOC entry 2448 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN score_types.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN score_types.id IS 'system id for this score type';


--
-- TOC entry 2449 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN score_types.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN score_types.info IS 'info for this match score';


--
-- TOC entry 201 (class 1259 OID 25068)
-- Name: score_types_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE score_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE score_types_id_seq OWNER TO tj_admin;

--
-- TOC entry 2450 (class 0 OID 0)
-- Dependencies: 201
-- Name: score_types_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE score_types_id_seq OWNED BY score_types.id;


--
-- TOC entry 204 (class 1259 OID 25081)
-- Name: sponsors; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE sponsors (
    id integer NOT NULL,
    info public.hstore
);


ALTER TABLE sponsors OWNER TO tj_admin;

--
-- TOC entry 2451 (class 0 OID 0)
-- Dependencies: 204
-- Name: TABLE sponsors; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE sponsors IS 'Sponsors for teams, events, groups, programs, etc
';


--
-- TOC entry 2452 (class 0 OID 0)
-- Dependencies: 204
-- Name: COLUMN sponsors.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN sponsors.id IS 'system id for this sponsor';


--
-- TOC entry 2453 (class 0 OID 0)
-- Dependencies: 204
-- Name: COLUMN sponsors.info; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN sponsors.info IS 'sponsor information';


--
-- TOC entry 203 (class 1259 OID 25079)
-- Name: sponsors_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE sponsors_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sponsors_id_seq OWNER TO tj_admin;

--
-- TOC entry 2454 (class 0 OID 0)
-- Dependencies: 203
-- Name: sponsors_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE sponsors_id_seq OWNED BY sponsors.id;


--
-- TOC entry 206 (class 1259 OID 25092)
-- Name: team_attributes; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE team_attributes (
    id integer NOT NULL,
    team_id integer,
    attributes public.hstore
);


ALTER TABLE team_attributes OWNER TO tj_admin;

--
-- TOC entry 2455 (class 0 OID 0)
-- Dependencies: 206
-- Name: TABLE team_attributes; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE team_attributes IS 'Attributes associated with a FIRST team';


--
-- TOC entry 2456 (class 0 OID 0)
-- Dependencies: 206
-- Name: COLUMN team_attributes.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_attributes.id IS 'system id for this attribute';


--
-- TOC entry 2457 (class 0 OID 0)
-- Dependencies: 206
-- Name: COLUMN team_attributes.team_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_attributes.team_id IS 'system id for associated team';


--
-- TOC entry 2458 (class 0 OID 0)
-- Dependencies: 206
-- Name: COLUMN team_attributes.attributes; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_attributes.attributes IS 'attributes';


--
-- TOC entry 205 (class 1259 OID 25090)
-- Name: team_attributes_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE team_attributes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE team_attributes_id_seq OWNER TO tj_admin;

--
-- TOC entry 2459 (class 0 OID 0)
-- Dependencies: 205
-- Name: team_attributes_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE team_attributes_id_seq OWNED BY team_attributes.id;


--
-- TOC entry 208 (class 1259 OID 25105)
-- Name: team_scores; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE team_scores (
    id integer NOT NULL,
    team_id integer,
    match_id integer,
    score_type_id integer,
    value character varying(64)[]
);


ALTER TABLE team_scores OWNER TO tj_admin;

--
-- TOC entry 2460 (class 0 OID 0)
-- Dependencies: 208
-- Name: TABLE team_scores; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE team_scores IS 'Scores associated with a FIRST team during a match at a competition
';


--
-- TOC entry 2461 (class 0 OID 0)
-- Dependencies: 208
-- Name: COLUMN team_scores.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_scores.id IS 'system id for this score';


--
-- TOC entry 2462 (class 0 OID 0)
-- Dependencies: 208
-- Name: COLUMN team_scores.team_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_scores.team_id IS 'system id for the associated team';


--
-- TOC entry 2463 (class 0 OID 0)
-- Dependencies: 208
-- Name: COLUMN team_scores.match_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_scores.match_id IS 'system id for the associated match';


--
-- TOC entry 2464 (class 0 OID 0)
-- Dependencies: 208
-- Name: COLUMN team_scores.score_type_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_scores.score_type_id IS 'system id for the associated score type';


--
-- TOC entry 2465 (class 0 OID 0)
-- Dependencies: 208
-- Name: COLUMN team_scores.value; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_scores.value IS 'score value';


--
-- TOC entry 207 (class 1259 OID 25103)
-- Name: team_scores_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE team_scores_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE team_scores_id_seq OWNER TO tj_admin;

--
-- TOC entry 2466 (class 0 OID 0)
-- Dependencies: 207
-- Name: team_scores_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE team_scores_id_seq OWNED BY team_scores.id;


--
-- TOC entry 210 (class 1259 OID 25118)
-- Name: team_sponsors; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE team_sponsors (
    id integer NOT NULL,
    team_id integer,
    sponsor_id integer,
    game_id integer
);


ALTER TABLE team_sponsors OWNER TO tj_admin;

--
-- TOC entry 2467 (class 0 OID 0)
-- Dependencies: 210
-- Name: TABLE team_sponsors; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE team_sponsors IS 'Sponsors associated with a FIRST team for a given game (season)';


--
-- TOC entry 2468 (class 0 OID 0)
-- Dependencies: 210
-- Name: COLUMN team_sponsors.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_sponsors.id IS 'system id for this team sponsor';


--
-- TOC entry 2469 (class 0 OID 0)
-- Dependencies: 210
-- Name: COLUMN team_sponsors.team_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_sponsors.team_id IS 'system id for the associated';


--
-- TOC entry 2470 (class 0 OID 0)
-- Dependencies: 210
-- Name: COLUMN team_sponsors.sponsor_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_sponsors.sponsor_id IS 'system id for the associated sponsor';


--
-- TOC entry 2471 (class 0 OID 0)
-- Dependencies: 210
-- Name: COLUMN team_sponsors.game_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN team_sponsors.game_id IS 'system id for the associated game';


--
-- TOC entry 209 (class 1259 OID 25116)
-- Name: team_sponsors_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE team_sponsors_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE team_sponsors_id_seq OWNER TO tj_admin;

--
-- TOC entry 2472 (class 0 OID 0)
-- Dependencies: 209
-- Name: team_sponsors_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE team_sponsors_id_seq OWNED BY team_sponsors.id;


--
-- TOC entry 196 (class 1259 OID 24905)
-- Name: teams; Type: TABLE; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE TABLE teams (
    id integer NOT NULL,
    program_id integer,
    number integer,
    name text,
    short_name character varying(64)[]
);


ALTER TABLE teams OWNER TO tj_admin;

--
-- TOC entry 2473 (class 0 OID 0)
-- Dependencies: 196
-- Name: TABLE teams; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON TABLE teams IS 'A team associated with a specific FIRST program';


--
-- TOC entry 2474 (class 0 OID 0)
-- Dependencies: 196
-- Name: COLUMN teams.id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN teams.id IS 'system id forteam';


--
-- TOC entry 2475 (class 0 OID 0)
-- Dependencies: 196
-- Name: COLUMN teams.program_id; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN teams.program_id IS 'system id for the associated program';


--
-- TOC entry 2476 (class 0 OID 0)
-- Dependencies: 196
-- Name: COLUMN teams.number; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN teams.number IS 'number for this team';


--
-- TOC entry 2477 (class 0 OID 0)
-- Dependencies: 196
-- Name: COLUMN teams.name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN teams.name IS ' name for this team';


--
-- TOC entry 2478 (class 0 OID 0)
-- Dependencies: 196
-- Name: COLUMN teams.short_name; Type: COMMENT; Schema: first; Owner: tj_admin
--

COMMENT ON COLUMN teams.short_name IS 'short name for this team';


--
-- TOC entry 195 (class 1259 OID 24903)
-- Name: teams_id_seq; Type: SEQUENCE; Schema: first; Owner: tj_admin
--

CREATE SEQUENCE teams_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE teams_id_seq OWNER TO tj_admin;

--
-- TOC entry 2479 (class 0 OID 0)
-- Dependencies: 195
-- Name: teams_id_seq; Type: SEQUENCE OWNED BY; Schema: first; Owner: tj_admin
--

ALTER SEQUENCE teams_id_seq OWNED BY teams.id;


--
-- TOC entry 2174 (class 2604 OID 24815)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY alliance_types ALTER COLUMN id SET DEFAULT nextval('alliance_types_id_seq'::regclass);


--
-- TOC entry 2175 (class 2604 OID 24824)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY alliances ALTER COLUMN id SET DEFAULT nextval('alliances_id_seq'::regclass);


--
-- TOC entry 2176 (class 2604 OID 24833)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY allies ALTER COLUMN id SET DEFAULT nextval('allies_id_seq'::regclass);


--
-- TOC entry 2177 (class 2604 OID 24842)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY attribute_types ALTER COLUMN id SET DEFAULT nextval('attribute_types_id_seq'::regclass);


--
-- TOC entry 2178 (class 2604 OID 24851)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY award_type ALTER COLUMN id SET DEFAULT nextval('award_type_id_seq'::regclass);


--
-- TOC entry 2179 (class 2604 OID 24860)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY awards ALTER COLUMN id SET DEFAULT nextval('awards_id_seq'::regclass);


--
-- TOC entry 2180 (class 2604 OID 24866)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY competitions ALTER COLUMN id SET DEFAULT nextval('competitions_id_seq'::regclass);


--
-- TOC entry 2181 (class 2604 OID 24875)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY events ALTER COLUMN id SET DEFAULT nextval('events_id_seq'::regclass);


--
-- TOC entry 2182 (class 2604 OID 24884)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY games ALTER COLUMN id SET DEFAULT nextval('games_id_seq'::regclass);


--
-- TOC entry 2183 (class 2604 OID 24893)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY locations ALTER COLUMN id SET DEFAULT nextval('locations_id_seq'::regclass);


--
-- TOC entry 2187 (class 2604 OID 25060)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY match_scores ALTER COLUMN id SET DEFAULT nextval('match_scores_id_seq'::regclass);


--
-- TOC entry 2186 (class 2604 OID 25050)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY matches ALTER COLUMN id SET DEFAULT nextval('matches_id_seq'::regclass);


--
-- TOC entry 2184 (class 2604 OID 24899)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY programs ALTER COLUMN id SET DEFAULT nextval('programs_id_seq'::regclass);


--
-- TOC entry 2188 (class 2604 OID 25126)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY score_types ALTER COLUMN id SET DEFAULT nextval('score_types_id_seq'::regclass);


--
-- TOC entry 2189 (class 2604 OID 25084)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY sponsors ALTER COLUMN id SET DEFAULT nextval('sponsors_id_seq'::regclass);


--
-- TOC entry 2190 (class 2604 OID 25095)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY team_attributes ALTER COLUMN id SET DEFAULT nextval('team_attributes_id_seq'::regclass);


--
-- TOC entry 2191 (class 2604 OID 25108)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY team_scores ALTER COLUMN id SET DEFAULT nextval('team_scores_id_seq'::regclass);


--
-- TOC entry 2192 (class 2604 OID 25121)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY team_sponsors ALTER COLUMN id SET DEFAULT nextval('team_sponsors_id_seq'::regclass);


--
-- TOC entry 2185 (class 2604 OID 24908)
-- Name: id; Type: DEFAULT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY teams ALTER COLUMN id SET DEFAULT nextval('teams_id_seq'::regclass);


--
-- TOC entry 2198 (class 2606 OID 24913)
-- Name: alliance_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY alliances
    ADD CONSTRAINT alliance_pk PRIMARY KEY (id);


--
-- TOC entry 2194 (class 2606 OID 24915)
-- Name: alliance_type_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY alliance_types
    ADD CONSTRAINT alliance_type_pk PRIMARY KEY (id);


--
-- TOC entry 2196 (class 2606 OID 24917)
-- Name: alliance_type_sn_unique; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY alliance_types
    ADD CONSTRAINT alliance_type_sn_unique UNIQUE (short_name);


--
-- TOC entry 2200 (class 2606 OID 24919)
-- Name: allies_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY allies
    ADD CONSTRAINT allies_pk PRIMARY KEY (id);


--
-- TOC entry 2202 (class 2606 OID 24921)
-- Name: attribute_type_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY attribute_types
    ADD CONSTRAINT attribute_type_pk PRIMARY KEY (id);


--
-- TOC entry 2204 (class 2606 OID 24923)
-- Name: award_type_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY award_type
    ADD CONSTRAINT award_type_pk PRIMARY KEY (id);


--
-- TOC entry 2206 (class 2606 OID 24925)
-- Name: awards_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY awards
    ADD CONSTRAINT awards_pk PRIMARY KEY (id);


--
-- TOC entry 2208 (class 2606 OID 24927)
-- Name: awards_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY awards
    ADD CONSTRAINT awards_uniqueness UNIQUE (type_id, event_id, competition_id, team_id);


--
-- TOC entry 2210 (class 2606 OID 24929)
-- Name: competitions_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY competitions
    ADD CONSTRAINT competitions_pk PRIMARY KEY (id);


--
-- TOC entry 2212 (class 2606 OID 24931)
-- Name: event_short_name_unique; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY events
    ADD CONSTRAINT event_short_name_unique UNIQUE (short_name);


--
-- TOC entry 2214 (class 2606 OID 24933)
-- Name: events_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY events
    ADD CONSTRAINT events_pk PRIMARY KEY (id);


--
-- TOC entry 2216 (class 2606 OID 24935)
-- Name: games_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY games
    ADD CONSTRAINT games_pk PRIMARY KEY (id);


--
-- TOC entry 2218 (class 2606 OID 24937)
-- Name: games_short_name_uniques; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY games
    ADD CONSTRAINT games_short_name_uniques UNIQUE (short_name);


--
-- TOC entry 2220 (class 2606 OID 24939)
-- Name: locations_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY locations
    ADD CONSTRAINT locations_pk PRIMARY KEY (id);


--
-- TOC entry 2241 (class 2606 OID 25078)
-- Name: match_score_type_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY score_types
    ADD CONSTRAINT match_score_type_pk PRIMARY KEY (id);


--
-- TOC entry 2237 (class 2606 OID 25067)
-- Name: match_score_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY match_scores
    ADD CONSTRAINT match_score_uniqueness UNIQUE (match_id, alliance_id, score_type_id);


--
-- TOC entry 2239 (class 2606 OID 25065)
-- Name: match_scores_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY match_scores
    ADD CONSTRAINT match_scores_pk PRIMARY KEY (id);


--
-- TOC entry 2233 (class 2606 OID 25054)
-- Name: match_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY matches
    ADD CONSTRAINT match_uniqueness UNIQUE (competition_id, match_number);


--
-- TOC entry 2235 (class 2606 OID 25052)
-- Name: matches_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY matches
    ADD CONSTRAINT matches_pk PRIMARY KEY (id);


--
-- TOC entry 2223 (class 2606 OID 24941)
-- Name: place_id_unique; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY locations
    ADD CONSTRAINT place_id_unique UNIQUE (place_id);


--
-- TOC entry 2225 (class 2606 OID 24943)
-- Name: program_short_name_unique; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY programs
    ADD CONSTRAINT program_short_name_unique UNIQUE (short_name);


--
-- TOC entry 2227 (class 2606 OID 24945)
-- Name: programs_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY programs
    ADD CONSTRAINT programs_pk PRIMARY KEY (id);


--
-- TOC entry 2243 (class 2606 OID 25089)
-- Name: sponsors_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY sponsors
    ADD CONSTRAINT sponsors_pk PRIMARY KEY (id);


--
-- TOC entry 2245 (class 2606 OID 25102)
-- Name: team_attribute_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_attributes
    ADD CONSTRAINT team_attribute_uniqueness UNIQUE (team_id);


--
-- TOC entry 2247 (class 2606 OID 25100)
-- Name: team_attributes_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_attributes
    ADD CONSTRAINT team_attributes_pk PRIMARY KEY (id);


--
-- TOC entry 2249 (class 2606 OID 25115)
-- Name: team_score_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_scores
    ADD CONSTRAINT team_score_uniqueness UNIQUE (team_id, match_id, score_type_id);


--
-- TOC entry 2251 (class 2606 OID 25113)
-- Name: team_scores_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_scores
    ADD CONSTRAINT team_scores_pk PRIMARY KEY (id);


--
-- TOC entry 2253 (class 2606 OID 25125)
-- Name: team_sponsor_uniqueness; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_sponsors
    ADD CONSTRAINT team_sponsor_uniqueness UNIQUE (team_id, sponsor_id, game_id);


--
-- TOC entry 2255 (class 2606 OID 25123)
-- Name: team_sponsors_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY team_sponsors
    ADD CONSTRAINT team_sponsors_pk PRIMARY KEY (id);


--
-- TOC entry 2229 (class 2606 OID 24947)
-- Name: teams_pk; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY teams
    ADD CONSTRAINT teams_pk PRIMARY KEY (id);


--
-- TOC entry 2231 (class 2606 OID 24949)
-- Name: teams_sn_unique; Type: CONSTRAINT; Schema: first; Owner: tj_admin; Tablespace:
--

ALTER TABLE ONLY teams
    ADD CONSTRAINT teams_sn_unique UNIQUE (short_name);


--
-- TOC entry 2221 (class 1259 OID 25044)
-- Name: nearest_location; Type: INDEX; Schema: first; Owner: tj_admin; Tablespace:
--

CREATE INDEX nearest_location ON locations USING gist (public.ll_to_earth(lat, lng));


--
-- TOC entry 2256 (class 2606 OID 24950)
-- Name: alliances_type_fk; Type: FK CONSTRAINT; Schema: first; Owner: tj_admin
--

ALTER TABLE ONLY alliances
    ADD CONSTRAINT alliances_type_fk FOREIGN KEY (type) REFERENCES alliance_types(id);


--
-- TOC entry 2374 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2015-07-17 22:05:23

--
-- PostgreSQL database dump complete
--

