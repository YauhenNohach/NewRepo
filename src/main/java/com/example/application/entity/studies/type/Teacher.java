package com.example.application.entity.studies.type;

import com.example.application.entity.studies.PersonalData;
import com.example.application.entity.studies.Student;
import com.example.application.entity.studies.UserApp;
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
@Table(name = "teachers")
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "student_teachers",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students = new ArrayList<>();

}
