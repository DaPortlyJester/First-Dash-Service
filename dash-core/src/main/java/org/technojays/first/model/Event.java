package org.technojays.first.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * @author DaPortlyJester
 * @since 1/17/2015
 * <p/>
 * Entity to represent a FIRST Event. Includes event information
 * such as event start time and venue
 */
@Entity
@Table(name = "events", schema = "first")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private EventType type;

    @Column(name = "code")
    private String eventCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }
}
