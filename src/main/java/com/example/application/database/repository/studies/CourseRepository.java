package com.example.application.database.repository.studies;

import com.example.application.entity.studies.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("SELECT c FROM Course c LEFT JOIN FETCH c.students WHERE c.id = :id")
    Optional<Course> findByIdWithStudents(@Param("id") Long id);
}

