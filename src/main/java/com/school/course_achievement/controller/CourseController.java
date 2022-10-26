package com.school.course_achievement.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.school.course_achievement.pojo.GraduateRequirement;
import com.school.course_achievement.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/target")
    public String getCourseTargetByKName(@Param("KName") String KName, Model model) {
        List<String> targetList = courseService.getCourseTargetByKName(KName);
        model.addAttribute("targetList", targetList);
        return "courseTarget";
    }

    @RequestMapping(value = "/requirement")
    public String getCourseRequirement(@Param("KName") String KName, Model model) {
        List<Map<String, String>> courseTargetPointList = courseService.getCourseTargetPointByKName(KName);
        model.addAttribute("courseTargetPointList", courseTargetPointList);
        return "courseRequirement";
    }

}
