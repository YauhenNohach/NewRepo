package com.example.application.dto.exhibit;


import lombok.Data;

import java.util.List;

@Data
public class CuratorDTO {
    private Long id;
    private String name;
    private int experienceYears;
    private String specialization;
    private List<ExhibitionDTO> exhibitions;
}


