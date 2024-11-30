package com.example.application.entity.studies;

import com.example.application.entity.studies.type.UserType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
@Entity
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "username", nullable = false, unique = true, length = 256)
    private String username;

    @Enumerated(EnumType.STRING)
    private UserType type;
}

