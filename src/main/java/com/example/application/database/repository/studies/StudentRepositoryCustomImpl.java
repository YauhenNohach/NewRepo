package com.example.application.database.repository.studies;


import com.example.application.entity.studies.QStudent;
import com.example.application.entity.studies.Student;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentRepositoryCustomImpl extends QuerydslRepositorySupport {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentRepositoryCustomImpl() {
        super(Student.class);
    }

    public List<Student> findStudentsWithTeachersByGrade(Integer grade) {
        QStudent student = QStudent.student;

        JPAQuery<Student> query = new JPAQuery<>(entityManager);
        return query.select(student)
                .from(student)
                .leftJoin(student.teachers)
                .where(student.grade.eq(grade))
                .fetch();
    }

//    JPAQuery<Student> query = new JPAQuery<>(entityManager);
//return query.select(student)
//            .from(student)
//            .leftJoin(student.teachers, teacher)  // join with Teacher entity
//            .fetch();
}
