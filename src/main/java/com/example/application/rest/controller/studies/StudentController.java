package com.example.application.rest.controller.studies;

import com.example.application.dto.studies.StudentDTO;
import com.example.application.entity.studies.UserApp;
import com.example.application.service.studies.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody UserApp user) {
        StudentDTO studentDTO = studentService.addStudent(user);
        return new ResponseEntity<>(studentDTO, HttpStatus.CREATED);
    }

    @GetMapping("/grade/{grade}")
    public ResponseEntity<StudentDTO> getStudentByGrade(@PathVariable Integer grade) {
        StudentDTO studentDTO = studentService.getStudentByGrade(grade);
        return studentDTO != null ? ResponseEntity.ok(studentDTO) : ResponseEntity.notFound().build();
    }
}

