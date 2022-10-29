package com.school.course_achievement.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.school.course_achievement.service.ClassDegreeService;
import com.school.course_achievement.service.CourseService;
import com.school.course_achievement.utils.DegreeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClassDegreeController {
    @Autowired
    ClassDegreeService classDegreeService;

    @Autowired
    CourseService courseService;
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

    @RequestMapping(value = "/classDegree/totalDegree")
    public String getTotalDegree(@Param("KName") String KName, Model model) {
        Map<String, Double> totalClassDegreeMap = classDegreeService.getTotalClassDegree(KName);
        model.addAttribute("totalClassDegreeMap", totalClassDegreeMap);
        return "totalDegree";
    }

    @RequestMapping(value = "/classDegree/targetDegree")
    public String getTargetDegree(@Param("KName") String KName, Model model) {
        Map<String, Double> targetDegreeMap = classDegreeService.getTargetDegree(KName);
        model.addAttribute("targetDegreeMap", targetDegreeMap);
        return "targetDegree";
    }

    @RequestMapping(value = "/classDegree/graduationDegree")
    public String getGraduationDegree(@Param("KName") String KName, Model model) {
        Map<String, Double> totalClassDegreeMap = classDegreeService.getTotalClassDegree(KName);
        Map<String, Double> targetDegreeMap = classDegreeService.getTargetDegree(KName);
        Map<String, Double> targetWeightMap = classDegreeService.getTargetWeight(KName);
        Map<String, String> targetMap = new HashMap<>();
        double requirementTarget1 = DegreeUtils.lowDegree(totalClassDegreeMap.get("target1TotalComment"), targetDegreeMap.get("target1Comment")) * targetWeightMap.get("totalTarget1Weight");
        requirementTarget1 = Double.parseDouble(String.format("%.2f", requirementTarget1));
        double requirementTarget2 = DegreeUtils.lowDegree(totalClassDegreeMap.get("target2TotalComment"), targetDegreeMap.get("target2Comment")) * targetWeightMap.get("totalTarget2Weight");
        requirementTarget2 = Double.parseDouble(String.format("%.2f", requirementTarget2));
        double requirementTarget3 = DegreeUtils.lowDegree(totalClassDegreeMap.get("target3TotalComment"), targetDegreeMap.get("target3Comment")) * targetWeightMap.get("totalTarget3Weight");
        requirementTarget3 = Double.parseDouble(String.format("%.2f", requirementTarget3));
        List<String> coursePoint = courseService.getCoursePoint(KName);
        targetMap.put("target1", String.valueOf(DegreeUtils.lowDegree(totalClassDegreeMap.get("target1TotalComment"), targetDegreeMap.get("target1Comment"))));
        targetMap.put("target2", String.valueOf(DegreeUtils.lowDegree(totalClassDegreeMap.get("target2TotalComment"), targetDegreeMap.get("target2Comment"))));
        targetMap.put("target3", String.valueOf(DegreeUtils.lowDegree(totalClassDegreeMap.get("target3TotalComment"), targetDegreeMap.get("target3Comment"))));
        targetMap.put("totalTarget1Weight", String.valueOf(targetWeightMap.get("totalTarget1Weight")));
        targetMap.put("totalTarget2Weight", String.valueOf(targetWeightMap.get("totalTarget2Weight")));
        targetMap.put("totalTarget3Weight", String.valueOf(targetWeightMap.get("totalTarget3Weight")));
        targetMap.put("requirementTarget1", String.valueOf(requirementTarget1));
        targetMap.put("requirementTarget2", String.valueOf(requirementTarget2));
        targetMap.put("requirementTarget3", String.valueOf(requirementTarget3));
        targetMap.put("point1", coursePoint.get(0));
        targetMap.put("point2", coursePoint.get(1));
        targetMap.put("point3", coursePoint.get(2));
        model.addAttribute("targetMap", targetMap);
        return "graduationDegree";
    }

    @RequestMapping(value = "/classDegree/submitComment")
    @ResponseBody
    public String submitComment(@Param("KName") String KName, @Param("kAnalyse") String kAnalyse, @Param("kImprovement") String kImprovement, @Param("kCommentTime") String kCommentTime) {
        int i = classDegreeService.submitComment(KName, kAnalyse, kImprovement, kCommentTime);
        return JSONUtils.toJSONString(i);
    }

    @RequestMapping(value = "/classDegree/getComment")
    @ResponseBody
    public String getComment(@Param("KName") String KName) {
        Map<String, String> kCommentMap = classDegreeService.getKComment(KName);
        return JSONUtils.toJSONString(kCommentMap);
    }

}
