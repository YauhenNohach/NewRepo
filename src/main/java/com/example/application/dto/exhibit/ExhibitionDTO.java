package com.example.application.dto.exhibit;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class ExhibitionDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private CuratorDTO curator;
    private List<ExhibitDTO> exhibits;
    private List<HallDTO> halls;

}

