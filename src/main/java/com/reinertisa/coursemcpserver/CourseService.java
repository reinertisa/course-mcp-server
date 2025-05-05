package com.reinertisa.coursemcpserver;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService {

    private static final Logger log = LoggerFactory.getLogger(CourseService.class);
    private final List<Course> courses = new ArrayList<>();

    @Tool(name = "ir_get_courses", description = "Get a list of courses from Isa Reinert")
    public List<Course> getCourses() {
        return courses;
    }

    @Tool(name = "ir_get_course", description = "Get a course from Isa Reinert by title")
    public Course getCourse(String title) {
        return courses.stream().filter(course -> course.title().equals(title)).findFirst().orElse(null);
    }

    @PostConstruct
    public void init() {
        courses.add(new Course("Java", "https://www.udemy.com/course/java-core-programming/"));
        courses.add(new Course("Python", "https://www.udemy.com/course/python-for-beginners/"));
        courses.add(new Course("C++", "https://www.udemy.com/course/c-for-beginners/"));
    }
}
