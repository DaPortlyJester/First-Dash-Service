/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * A competition describes a Location, Game, and is held at an Event
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Competition implements Serializable {

	private static final long serialVersionUID = -427964775;

	private Integer id;
	private String  name;
	private Integer typeId;
	private Integer eventId;
	private Integer locationId;
	private Integer gameId;

	public Competition() {}

	public Competition(Competition value) {
		this.id = value.id;
		this.name = value.name;
		this.typeId = value.typeId;
		this.eventId = value.eventId;
		this.locationId = value.locationId;
		this.gameId = value.gameId;
	}

	public Competition(
		Integer id,
		String  name,
		Integer typeId,
		Integer eventId,
		Integer locationId,
		Integer gameId
	) {
		this.id = id;
		this.name = name;
		this.typeId = typeId;
		this.eventId = eventId;
		this.locationId = locationId;
		this.gameId = gameId;
	}

	public Integer getId() {
		return this.id;
	}

	public Competition setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public Competition setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public Competition setTypeId(Integer typeId) {
		this.typeId = typeId;
		return this;
	}

	public Integer getEventId() {
		return this.eventId;
	}

	public Competition setEventId(Integer eventId) {
		this.eventId = eventId;
		return this;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public Competition setLocationId(Integer locationId) {
		this.locationId = locationId;
		return this;
	}

	public Integer getGameId() {
		return this.gameId;
	}

	public Competition setGameId(Integer gameId) {
		this.gameId = gameId;
		return this;
	}
}