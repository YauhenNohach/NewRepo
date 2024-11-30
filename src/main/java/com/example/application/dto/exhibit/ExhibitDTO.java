package com.example.application.dto.exhibit;

import lombok.Data;

@Data
public class ExhibitDTO {
    private Long id;
    private String name;
    private String description;
    private boolean isPermanent;

}
