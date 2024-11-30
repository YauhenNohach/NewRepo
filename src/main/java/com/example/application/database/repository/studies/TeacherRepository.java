package com.example.application.database.repository.studies;

import com.example.application.entity.studies.type.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    // RIGHT JOIN: все учителя, даже если у них нет студентов
    @Query("SELECT t FROM Teacher t RIGHT JOIN t.students s WHERE s.grade = :grade")
    List<Teacher> findTeachersForGrade(@Param("grade") Integer grade);
}
