/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Types of scores associated with matches
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScoreType implements Serializable {

	private static final long serialVersionUID = -254162714;

	private Integer id;
	private Object  info;

	public ScoreType() {}

	public ScoreType(ScoreType value) {
		this.id = value.id;
		this.info = value.info;
	}

	public ScoreType(
		Integer id,
		Object  info
	) {
		this.id = id;
		this.info = info;
	}

	public Integer getId() {
		return this.id;
	}

	public ScoreType setId(Integer id) {
		this.id = id;
		return this;
	}

	public Object getInfo() {
		return this.info;
	}

	public ScoreType setInfo(Object info) {
		this.info = info;
		return this;
	}
}