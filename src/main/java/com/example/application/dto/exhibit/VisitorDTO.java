package com.example.application.dto.exhibit;

import lombok.Data;

import java.util.List;

@Data
public class VisitorDTO {
    private Long id;
    private String name;
    private List<VisitRecordDTO> visitRecords;

}

