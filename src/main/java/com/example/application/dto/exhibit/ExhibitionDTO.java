package com.example.application.dto.exhibit;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class ExhibitionDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private CuratorDTO curator;
    private Set<ExhibitDTO> exhibits;
    private Set<HallDTO> halls;

}

