package com.example.application.entity.football;

import javax.persistence.*;

@Embeddable
public class PlayerStatistic {
    @Column(nullable = false)
    private String matchId;

    @Column(nullable = false)
    private int goals;

    @Column(nullable = false)
    private int assists;

    @Column(nullable = false)
    private int yellowCards;

    @Column(nullable = false)
    private int redCards;

}
