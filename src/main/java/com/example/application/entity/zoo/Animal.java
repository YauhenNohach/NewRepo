package com.example.application.entity.zoo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String species;

    @Column
    private LocalDate birthDate;

    private Enclosure enclosure;

    private Zoologist zoologist;

}
