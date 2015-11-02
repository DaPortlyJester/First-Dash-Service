/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Sponsors for teams, events, groups, programs, etc
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sponsor implements Serializable {

	private static final long serialVersionUID = -1806273386;

	private Integer id;
	private Object  info;

	public Sponsor() {}

	public Sponsor(Sponsor value) {
		this.id = value.id;
		this.info = value.info;
	}

	public Sponsor(
		Integer id,
		Object  info
	) {
		this.id = id;
		this.info = info;
	}

	public Integer getId() {
		return this.id;
	}

	public Sponsor setId(Integer id) {
		this.id = id;
		return this;
	}

	public Object getInfo() {
		return this.info;
	}

	public Sponsor setInfo(Object info) {
		this.info = info;
		return this;
	}
}