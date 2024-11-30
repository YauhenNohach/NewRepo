package com.example.application.rest.controller.studies;

import com.example.application.service.studies.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    @DeleteMapping("/remove/student")
    public void removeStudentFromCourse(@RequestParam Long courseId, @RequestParam Long studentId){
        courseService.removeStudentFromCourse(courseId, studentId);
    }

    @DeleteMapping("/remove/{courseId}")
    public void removeCourse(@PathVariable Long courseId){
        courseService.removeCourse(courseId);
    }
}
