package com.example.application.entity.football;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate matchDate;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @OneToOne()
    @JoinColumn(name = "team_id")
    private Team team;

    @ElementCollection()
    @CollectionTable(name = "playerActions", joinColumns = @JoinColumn(name = "match_id"))
    private List<PlayerAction> playerActions;
}
