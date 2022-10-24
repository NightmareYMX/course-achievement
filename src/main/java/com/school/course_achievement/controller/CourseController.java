package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.GraduateRequirement;
import com.school.course_achievement.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/name")
    @ResponseBody
    public List<String> getAllCourseName() {
        return courseService.getAllCourseName();
    }

    @RequestMapping(value = "/target")
    public String getCourseTargetByKNo(@Param("KNo") String KNo, Model model) {
        List<String> targetList = courseService.getCourseTargetByKNo(KNo);
        model.addAttribute("targetList", targetList);
        return "courseTarget";
    }

    @RequestMapping(value = "/requirement")
    public String getCourseRequirement(@Param("KName") String KName, Model model) {
        List<GraduateRequirement> courseTargetPointList = courseService.getCourseTargetPointByKName(KName);
        model.addAttribute("courseTargetPointList", courseTargetPointList);
        return "courseRequirement";
    }

}
