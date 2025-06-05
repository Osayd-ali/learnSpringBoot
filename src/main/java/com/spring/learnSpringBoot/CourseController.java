package com.spring.learnSpringBoot;
//Creating Rest api controller for Course

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // Courses
    // Course: id, name, author
    // Mapping a url to this specific method
    // When somebody hits /courses, this method will be called
    // http://localhost:8080/courses
    // Using springboot, creating rest api is very easy as we did not need to create a web.xml file or any other configuration file.
    // We just needed to focus on business logic. springboot will take care of the rest.
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn Spring Boot", "John Doe"),
            new Course(2, "Learn Java", "Jane Doe"),
            new Course(3, "Learn Python", "Alice Smith"),
            new Course(4, "Learn JavaScript", "Bob Johnson"),
            new Course(6, "Learn JavaScript", "Bob Johnson")
        );
    }
}