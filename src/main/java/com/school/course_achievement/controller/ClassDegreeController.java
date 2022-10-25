package com.school.course_achievement.controller;

import com.school.course_achievement.service.ClassDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassDegreeController {
    @Autowired
    ClassDegreeService classDegreeService;

    @RequestMapping("/")
    public String calculateDegree() {
        classDegreeService.calculateDegreeOne();
        classDegreeService.calculateDegreeTwo();
        return "login";
    }
}
