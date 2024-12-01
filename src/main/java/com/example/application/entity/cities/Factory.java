package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "factories")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
