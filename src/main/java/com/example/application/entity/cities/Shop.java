package com.example.application.entity.cities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "shops", fetch = FetchType.LAZY)
    private List<City> cities = new ArrayList<>();

    @Embedded
    private Address address;

}
