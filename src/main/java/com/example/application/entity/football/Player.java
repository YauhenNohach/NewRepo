package com.example.application.entity.football;

import javax.persistence.*;
import java.util.List;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false, unique = true)
    private int jerseyNumber;

    private Team team;

    private PlayerStatistic statistics;

    private List<String> trophies;
}
