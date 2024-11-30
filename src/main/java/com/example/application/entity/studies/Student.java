package com.example.application.entity.studies;

import com.example.application.entity.studies.type.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "students")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
//    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", allocationSize = 1)
    private Long id;

    private Integer grade;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserApp user;

    @Embedded
    private PersonalData personalData;

    @ElementCollection
    @CollectionTable(name = "user_phone", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "phone_number")
    private List<String> phoneNumbers = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToMany(mappedBy = "students")
    private List<Teacher> teachers = new ArrayList<>();

}
