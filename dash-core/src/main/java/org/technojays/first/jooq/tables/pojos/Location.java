/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Locations for program
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Location implements Serializable {

	private static final long serialVersionUID = -336918594;

	private Integer id;
	private Double  lng;
	private Double  lat;
	private Integer placeId;

	public Location() {}

	public Location(Location value) {
		this.id = value.id;
		this.lng = value.lng;
		this.lat = value.lat;
		this.placeId = value.placeId;
	}

	public Location(
		Integer id,
		Double  lng,
		Double  lat,
		Integer placeId
	) {
		this.id = id;
		this.lng = lng;
		this.lat = lat;
		this.placeId = placeId;
	}

	public Integer getId() {
		return this.id;
	}

	public Location setId(Integer id) {
		this.id = id;
		return this;
	}

	public Double getLng() {
		return this.lng;
	}

	public Location setLng(Double lng) {
		this.lng = lng;
		return this;
	}

	public Double getLat() {
		return this.lat;
	}

	public Location setLat(Double lat) {
		this.lat = lat;
		return this;
	}

	public Integer getPlaceId() {
		return this.placeId;
	}

	public Location setPlaceId(Integer placeId) {
		this.placeId = placeId;
		return this;
	}
}
