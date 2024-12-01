package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "universeties")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
}
