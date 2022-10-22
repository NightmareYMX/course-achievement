package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.Teacher;
import com.school.course_achievement.service.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
    public String teacherLogin(@Param("username") String username, @Param("password") String password) {
        int i = teacherService.teacherLogin(new Teacher(username, null, password));
        if (i == 1) {
            return "main";
        } else {
            return "login";
        }
    }
}
