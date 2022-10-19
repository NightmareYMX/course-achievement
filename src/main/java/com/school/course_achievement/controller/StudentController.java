package com.school.course_achievement.controller;

import com.school.course_achievement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("login")
    public String loginController(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户名：" + username + "密码：" + password);
        int row = studentService.findUser(username, password);
        System.out.println("结果" + row);
        if (row == 1) {
            return "index";
        }
        return "";
    }
}
