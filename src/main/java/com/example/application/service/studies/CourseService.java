package com.example.application.service.studies;

import com.example.application.database.repository.studies.CourseRepository;
import com.example.application.database.repository.studies.StudentRepository;
import com.example.application.entity.studies.Course;
import com.example.application.entity.studies.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class CourseService {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    public void removeStudentFromCourse(Long courseId, Long studentId) {
        log.info("Removing student {} from course {}", studentId, courseId);

        Course course = courseRepository.findByIdWithStudents(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        course.removeStudent(student);

        student.setCourse(null);

        courseRepository.save(course);

//        studentRepository.delete(student);
    }


    public void removeCourse(Long courseId){
        courseRepository.deleteById(courseId);
    }
}
