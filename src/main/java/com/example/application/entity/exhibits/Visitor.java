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

    @OneToMany(mappedBy = "visitor",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exhibition> exhibitions;

    @ElementCollection
    @CollectionTable(name = "visitorExebitions", joinColumns = @JoinColumn(name = "visitor_id"))
    private List<VisitRecord> visitRecords;
}
