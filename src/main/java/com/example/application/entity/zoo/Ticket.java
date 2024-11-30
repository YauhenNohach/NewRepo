package com.example.application.entity.zoo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String visitorName;

    @Column(name = "zone_id")
    private List<Long> zones;

    @Column(nullable = false)
    private LocalDate visitDate;

}
