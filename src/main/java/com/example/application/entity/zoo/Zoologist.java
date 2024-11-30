package com.example.application.entity.zoo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private int experienceYears;

    private List<Animal> animals;

}
