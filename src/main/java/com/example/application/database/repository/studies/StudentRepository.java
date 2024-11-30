package com.example.application.database.repository.studies;

import com.example.application.entity.studies.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.teachers WHERE s.grade = :grade")
    Optional<Student> findByGradeWithTeachers(@Param("grade") Integer grade);

    // INNER JOIN: студенты, которые имеют учителей
//    @Query("SELECT s FROM Student s INNER JOIN s.teachers t WHERE s.grade = :grade")
//    List<Student> findStudentsWithTeachers(@Param("grade") Integer grade);

    // LEFT JOIN: all students and their teachers
//    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.teachers t")
//    @EntityGraph(attributePaths = {"teachers", "teachers.courses"})
//    List<Student> findAllStudentsWithTeachers();

    Optional<Student> findAllByGrade(Integer grade);
    Optional<Student> findByGrade(Integer grade);

}
