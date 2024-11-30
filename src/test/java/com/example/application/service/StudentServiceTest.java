package com.example.application.service;

import com.example.application.database.repository.studies.StudentRepository;
import com.example.application.database.repository.studies.UserRepository;
import com.example.application.dto.studies.StudentDTO;
import com.example.application.entity.studies.Student;
import com.example.application.entity.studies.UserApp;
import com.example.application.mapper.StudentMapper;
import com.example.application.service.studies.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    private final static Long STUDENT_ID = 1L;
    @Mock
    private StudentRepository studentRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private StudentMapper studentMapper;

    @InjectMocks
    private StudentService studentService;

    @Test
    void addStudent() {

        UserApp mockUser = new UserApp();
        mockUser.setUsername("testuser");

        Student mockStudent = new Student();
        mockStudent.setId(STUDENT_ID);
        mockStudent.setUser(mockUser);

        StudentDTO mockStudentDTO = new StudentDTO();
        mockStudentDTO.setId(STUDENT_ID);

        doReturn(mockStudent).when(studentRepository).save(any(Student.class));
        doReturn(mockStudentDTO).when(studentMapper).toDTO(any(Student.class));

        StudentDTO result = studentService.addStudent(mockUser);

        assertNotNull(result);
        assertEquals(STUDENT_ID, result.getId());

        verify(userRepository).save(mockUser);
        verify(studentRepository).save(any(Student.class));
        verify(studentMapper).toDTO(any(Student.class));
    }

    @Test
    void getStudentByGrade() {
    }
}