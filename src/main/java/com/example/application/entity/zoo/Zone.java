package com.example.application.entity.zoo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private List<Enclosure> enclosures;

}
