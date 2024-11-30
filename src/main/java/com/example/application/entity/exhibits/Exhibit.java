package com.example.application.entity.exhibits;

import lombok.Data;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "exhibits")
@Data
public class Exhibit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean isPermanent;

    private Set<Exhibition> exhibitions;

}
