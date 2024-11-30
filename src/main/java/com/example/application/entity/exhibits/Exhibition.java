package com.example.application.entity.exhibits;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "exhibitions" )
@Data
public class Exhibition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @ManyToOne()
    @JoinColumn(name = "curator_id")
    private Curator curator;

    @ManyToMany
    @JoinTable(name="exhibition_exhibit", joinColumns = @JoinColumn(name = "exhibitions_id"), inverseJoinColumns = @JoinColumn(name = "exhibits_id"))
    private List<Exhibit> exhibits = new ArrayList<>();

    @ManyToMany
    @JoinTable(name= "exhibitions_halls", joinColumns = @JoinColumn(name = "exhibitions_id"), inverseJoinColumns = @JoinColumn(name="halls_id"))
    private List<Hall> halls = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;
}
