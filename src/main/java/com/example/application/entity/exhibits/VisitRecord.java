package com.example.application.entity.exhibits;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class VisitRecord {
    @Column(nullable = false)
    private Long exhibitionId;

    @Column(nullable = false)
    private LocalDate visitDate;

}
