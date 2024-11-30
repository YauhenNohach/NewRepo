package com.example.application.util;

import com.example.application.database.repository.studies.StudentRepository;
import com.example.application.database.repository.studies.UserRepository;
import com.example.application.entity.studies.UserApp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetEntity {

    private final StudentRepository studentRepository;
    private final UserRepository userRepository;

    public UserApp getUserById(Long idUser) {
        return userRepository.findById(idUser)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + idUser));
    }
}