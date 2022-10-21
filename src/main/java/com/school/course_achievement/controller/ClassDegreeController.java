package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.service.ClassDegreeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClassDegreeController {
    @Autowired
    private ClassDegreeService classDegreeService;

    @RequestMapping(value = "/classDegreeList")
    public String getAllClassDegree(@Param("KNo") String KNo, Model model) {
        List<ClassDegree> classDegreeList = classDegreeService.getAllClassDegree(KNo);
        model.addAttribute("allClassDegree", classDegreeList);
        return "classDegreeList";
    }
}
