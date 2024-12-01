package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
