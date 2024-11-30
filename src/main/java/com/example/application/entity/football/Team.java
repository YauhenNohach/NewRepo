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

    @OneToOne(mappedBy = "team")
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @OneToOne(mappedBy = "team")
    @JoinColumn(name = "match_id")
    private Match match;
}
