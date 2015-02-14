package org.technojays.first.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author DaPortlyJester
 * @since 1/19/2015
 */
public class Ally {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false)
    Long id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    private Long allianceNumber;
}
