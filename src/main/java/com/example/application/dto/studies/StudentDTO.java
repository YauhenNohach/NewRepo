package com.example.application.dto.studies;

import com.example.application.entity.studies.PersonalData;
import com.example.application.entity.studies.type.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {

    private Long id;
    private Integer grade;
    private String username;
    private PersonalData personalData;
    private List<String> phoneNumbers;
    private List<Teacher> teachers;

    public StudentDTO(Long id) {
        this.id = id;
    }
}
