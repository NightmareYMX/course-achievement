package com.school.course_achievement.controller;

import com.school.course_achievement.service.ClassDegreeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ClassDegreeController {
    @Autowired
    ClassDegreeService classDegreeService;

    @RequestMapping("/")
    public String calculateDegree(HttpSession httpSession) {
        int insertOne = classDegreeService.calculateDegreeOne();
        int insertTwo = classDegreeService.calculateDegreeTwo();
        httpSession.setAttribute("dataIsNotEmpty", insertOne + insertTwo);
        return "login";
    }

    @RequestMapping(value = "/classDegree/ordinaryDegree")
    public String getOrdinaryDegree(@Param("KName") String KName, Model model) {
        Map<String, Double> ordinaryClassDegreeMap = classDegreeService.getOrdinaryClassDegree(KName);
        model.addAttribute("ordinaryClassDegreeMap", ordinaryClassDegreeMap);
        return "ordinaryDegree";
    }

    @RequestMapping(value = "/classDegree/finalDegree")
    public String getFinalDegree(@Param("KName") String KName, Model model) {
        Map<String, Double> finalClassDegreeMap = classDegreeService.getFinalClassDegree(KName);
        model.addAttribute("finalClassDegreeMap", finalClassDegreeMap);
        return "finalDegree";
    }
}
