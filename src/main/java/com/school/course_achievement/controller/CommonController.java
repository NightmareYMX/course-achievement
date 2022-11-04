package com.school.course_achievement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Lee
 * @date: 10:14
 * @description:
 */
@Controller
public class CommonController {
    @RequestMapping("/login")
    public String jumpToLogin() {
        return "login";
    }

    @RequestMapping("/index")
    public String jumpToIndex() {
        return "index";
    }

    @RequestMapping("/left")
    public String jumpToLeft() {
        return "left";
    }

    @RequestMapping("/main")
    public String jumpToMain() {
        return "main";
    }

    @RequestMapping("/right")
    public String jumpToRight() {
        return "right";
    }

    @RequestMapping("/top")
    public String jumpToTop() {
        return "top";
    }

}
