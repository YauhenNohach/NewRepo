package com.example.application.entity.exhibits;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "halls")
@Data
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String location;

    private Set<Exhibition> exhibitions;

}
