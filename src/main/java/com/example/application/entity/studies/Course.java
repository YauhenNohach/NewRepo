package com.example.application.entity.studies;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private  String name;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        student.setCourse(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setCourse(null);
    }
}
