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

    private Stadium stadium;

    private Season season;


    private Team team;

    private List<PlayerAction> playerActions;
}
