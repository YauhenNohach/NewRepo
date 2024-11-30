package com.example.application.entity.football;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlayerAction {
    @Column(nullable = false)
    private Long playerId;

    @Column
    private int goals;

    @Column
    private int assists;

    @Column
    private int yellowCards;

    @Column
    private int redCards;

}
