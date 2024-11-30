package com.example.application.service.studies;

import com.example.application.database.repository.studies.StudentRepository;
import com.example.application.database.repository.studies.StudentRepositoryCustomImpl;
import com.example.application.database.repository.studies.UserRepository;
import com.example.application.dto.studies.StudentDTO;
import com.example.application.entity.studies.Student;
import com.example.application.entity.studies.UserApp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.application.mapper.StudentMapper;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;
    private final UserRepository userRepository;
    private final StudentMapper studentMapper;

    private final StudentRepositoryCustomImpl studentRepositoryCustomImpl;

    public List<Student> getStudentsWithTeachersByGrade(Integer grade) {
        return studentRepositoryCustomImpl.findStudentsWithTeachersByGrade(grade);
    }

    public StudentDTO addStudent(UserApp user) {
        log.info("Creating a new user with username: {}", user.getUsername());

        userRepository.save(user);

        Student student = new Student();
        student.setUser(user);
        studentRepository.save(student);

        log.info("Student with id {} created successfully.", student.getId());

        return studentMapper.toDTO(student);
    }

    public StudentDTO getStudentByGrade(Integer grade) {
        log.info("Fetching student with grade: {}", grade);

        Student student = studentRepository.findByGradeWithTeachers(grade)
                .orElseThrow(() -> new RuntimeException("Student not found with grade: " + grade));

        log.info("Found student with id {}", student.getId());

        return studentMapper.toDTO(student);
    }
}

