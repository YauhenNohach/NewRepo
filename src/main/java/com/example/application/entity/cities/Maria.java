package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "maries")
public class Maria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "maria")
    private City city;
}
