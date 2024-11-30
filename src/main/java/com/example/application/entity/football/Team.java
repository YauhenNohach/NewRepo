package com.example.application.entity.football;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Coach coach;

    private List<Player> players;

    private Stadium stadium;

    private List<Match> matches;
}
