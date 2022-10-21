package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/courseList")
    @ResponseBody
    public List<Course> getAllCourse() {
        List<Course> courseList = courseService.getAllCourse();
        return courseList;
    }

}
