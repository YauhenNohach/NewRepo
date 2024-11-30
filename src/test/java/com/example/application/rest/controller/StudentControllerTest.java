package com.example.application.rest.controller;

import com.example.application.dto.studies.StudentDTO;
import com.example.application.entity.studies.UserApp;
import com.example.application.rest.controller.studies.StudentController;
import com.example.application.service.studies.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void addStudent() throws Exception {

        UserApp user = new UserApp();
        user.setUsername("testuser");

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);

        when(studentService.addStudent(any(UserApp.class))).thenReturn(studentDTO);

        mockMvc.perform(post("/api/students/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L));
    }
}