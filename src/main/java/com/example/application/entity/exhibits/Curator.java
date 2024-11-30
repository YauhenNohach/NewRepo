package com.example.application.entity.exhibits;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curators")
@Data
public class Curator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int experienceYears;

    @Column
    private String specialization;

    @OneToMany(mappedBy = "curator", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exhibition> exhibitions;


}
