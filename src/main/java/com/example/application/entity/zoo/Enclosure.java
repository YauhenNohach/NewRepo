package com.example.application.entity.zoo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int capacity;

    private Zone zone;

    private List<Animal> animals;

}
