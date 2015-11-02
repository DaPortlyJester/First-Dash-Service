/**
 * This class is generated by jOOQ
 */
package org.technojays.first.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


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
@Entity
@Table(name = "sponsor", schema = "first")
public interface ISponsor extends Serializable {

	/**
	 * Setter for <code>first.sponsor.id</code>. system id for this sponsor
	 */
	public ISponsor setId(Integer value);

	/**
	 * Getter for <code>first.sponsor.id</code>. system id for this sponsor
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 32)
	public Integer getId();

	/**
	 * Setter for <code>first.sponsor.info</code>. sponsor information
	 */
	public ISponsor setInfo(Object value);

	/**
	 * Getter for <code>first.sponsor.info</code>. sponsor information
	 */
	@Column(name = "info")
	public Object getInfo();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ISponsor
	 */
	public void from(org.technojays.first.jooq.tables.interfaces.ISponsor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ISponsor
	 */
	public <E extends org.technojays.first.jooq.tables.interfaces.ISponsor> E into(E into);
}