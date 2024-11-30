package com.example.application.mapper;

//import com.example.application.entity.User;
import com.example.application.dto.studies.StudentDTO;
import com.example.application.entity.studies.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") //  its mean that MapStruct integrate with Spring Framework,
 // and generation class will be register how Spring Bean
public interface StudentMapper {

    @Mapping(source = "user.username", target = "username") // make rules for mapping
    StudentDTO toDTO(Student student);

//    @Mapping(source = "username", target = "user.username")
//    Student toEntity(StudentDTO studentDTO, User user);
}
