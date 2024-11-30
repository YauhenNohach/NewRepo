package com.example.application.entity.exhibits;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "visitors")
@Data
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private List<VisitRecord> visitRecords;

}
