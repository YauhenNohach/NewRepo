package com.example.application.dto.exhibit;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VisitRecordDTO {
    private Long exhibitionId;
    private LocalDate visitDate;

}
