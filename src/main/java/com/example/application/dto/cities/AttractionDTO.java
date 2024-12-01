package com.example.application.dto.cities;

import lombok.Data;

@Data
public class AttractionDTO {
    private Long id;
    private String name;
    private CityDTO city;
}
