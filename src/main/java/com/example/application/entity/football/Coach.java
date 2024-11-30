package com.example.application.entity.football;

import javax.persistence.*;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int experienceYears;

    @OneToOne(mappedBy = "coach")
    private Team team;
}