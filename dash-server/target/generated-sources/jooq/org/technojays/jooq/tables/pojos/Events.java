/**
 * This class is generated by jOOQ
 */
package org.technojays.jooq.tables.pojos;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.technojays.jooq.tables.interfaces.IEvents;


/**
 * An event describes the timeframe for competitions and celebrations that 
 * are managed together
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
@Table(name = "events", schema = "first")
public class Events implements IEvents {

	private static final long serialVersionUID = -963507892;

	private Integer   id;
	private String    name;
	private String[]  shortName;
	private Timestamp startDate;
	private Timestamp endDate;
	private Object    info;

	public Events() {}

	public Events(Events value) {
		this.id = value.id;
		this.name = value.name;
		this.shortName = value.shortName;
		this.startDate = value.startDate;
		this.endDate = value.endDate;
		this.info = value.info;
	}

	public Events(
		Integer   id,
		String    name,
		String[]  shortName,
		Timestamp startDate,
		Timestamp endDate,
		Object    info
	) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.info = info;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Events setId(Integer id) {
		this.id = id;
		return this;
	}

	@Column(name = "name")
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Events setName(String name) {
		this.name = name;
		return this;
	}

	@Column(name = "short_name", unique = true)
	@Override
	public String[] getShortName() {
		return this.shortName;
	}

	@Override
	public Events setShortName(String[] shortName) {
		this.shortName = shortName;
		return this;
	}

	@Column(name = "start_date")
	@Override
	public Timestamp getStartDate() {
		return this.startDate;
	}

	@Override
	public Events setStartDate(Timestamp startDate) {
		this.startDate = startDate;
		return this;
	}

	@Column(name = "end_date")
	@Override
	public Timestamp getEndDate() {
		return this.endDate;
	}

	@Override
	public Events setEndDate(Timestamp endDate) {
		this.endDate = endDate;
		return this;
	}

	@Column(name = "info")
	@Override
	public Object getInfo() {
		return this.info;
	}

	@Override
	public Events setInfo(Object info) {
		this.info = info;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IEvents from) {
		setId(from.getId());
		setName(from.getName());
		setShortName(from.getShortName());
		setStartDate(from.getStartDate());
		setEndDate(from.getEndDate());
		setInfo(from.getInfo());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IEvents> E into(E into) {
		into.from(this);
		return into;
	}
}