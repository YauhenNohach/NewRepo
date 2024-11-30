package com.example.application.entity.football;

import javax.persistence.*;
import java.util.List;

@Entity
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int year;

    private List<Match> matches;
}
