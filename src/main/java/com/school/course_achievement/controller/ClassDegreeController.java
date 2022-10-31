package com.school.course_achievement.controller;

import cn.afterturn.easypoi.word.WordExportUtil;
import com.alibaba.druid.support.json.JSONUtils;
import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.mapper.TeacherMapper;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.pojo.CourseExample;
import com.school.course_achievement.pojo.Teacher;
import com.school.course_achievement.pojo.TeacherExample;
import com.school.course_achievement.service.ClassDegreeService;
import com.school.course_achievement.service.CourseService;
import com.school.course_achievement.utils.DegreeUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeacherMapper teacherMapper;
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

//    @RequestMapping(value = "/classDegree/submitComment")
//    public String submitComment(@Param("KName") String KName, @Param("kAnalyse") String kAnalyse, @Param("kImprovement") String kImprovement, @Param("kCommentTName") String kCommentTName, @Param("kCommentTime") String kCommentTime, Model model) {
//        int i = classDegreeService.submitComment(KName, kAnalyse, kImprovement, kCommentTName, kCommentTime);
//        model.addAttribute("submitCommentIsSuccess", i);
//        return "comment";
//    }

    @RequestMapping(value = "/classDegree/getComment")
    public String getComment(@Param("KName") String KName, Model model) {
        Map<String, String> kCommentMap = classDegreeService.getKComment(KName);
        model.addAttribute("kCommentMap", kCommentMap);
        return "comment";
    }

//    @RequestMapping(value = "/classDegree/submitComment")
//    public String submitSuggestion(@Param("KName") String KName,@Param("kSuggestion") String kSuggestion, Model model) {
//        int i = classDegreeService.submitSuggestion(KName, kSuggestion);
//        model.addAttribute("submitSuggestionIsSuccess", i);
//        return "suggestion";
//    }

    @RequestMapping(value = "/classDegree/suggestion")
    public String getSuggestion(@Param("KName") String KName, Model model) {
        Map<String, String> kSuggestionMap = classDegreeService.getKSuggestion(KName);
        model.addAttribute("kSuggestionMap", kSuggestionMap);
        return "suggestion";
    }

    @RequestMapping(value = "/classDegree/getWord")
    public void getWord(@Param("KName") String KName, HttpServletResponse response) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String tNo = courseList.get(0).gettNo();
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria teacherExampleCriteria = teacherExample.createCriteria();
        teacherExampleCriteria.andTNoEqualTo(tNo);
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        String tName = null;
        if (!teacherList.isEmpty()) {
            tName = teacherList.get(0).gettName();
        }
        Map<String, Double> ordinaryClassDegreeMap = classDegreeService.getOrdinaryClassDegree(KName);
        Map<String, Double> finalClassDegreeMap = classDegreeService.getFinalClassDegree(KName);
        Map<String, Double> totalClassDegreeMap = classDegreeService.getTotalClassDegree(KName);
        List<String> courseTargetList = courseService.getCourseTargetByKName(KName);
        List<Map<String, String>> courseTargetPointList = courseService.getCourseTargetPointByKName(KName);
        Map<String, String> kCommentMap = classDegreeService.getKComment(KName);
        Map<String, String> kSuggestionMap = classDegreeService.getKSuggestion(KName);
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
        String template = KName + ".docx";
        String fileName = KName + "achievement-report" + ".docx";
        String url = String.format("%s\\src\\main\\resources\\templates\\%s", System.getProperty("user.dir"), template);
        Map<String, Object> map = new HashMap<>();
        String courseTarget1 = courseTargetList.get(0);
        String courseTarget2 = courseTargetList.get(1);
        String courseTarget3 = courseTargetList.get(2);
        map.put("cNo", "201");
        map.put("tName", tName);
        map.put("courseTarget1", courseTarget1);
        map.put("courseTarget2", courseTarget2);
        map.put("courseTarget3", courseTarget3);
        map.put("rContent1", courseTargetPointList.get(0).get("rContent"));
        map.put("courseTargetPoint1", courseTargetPointList.get(0).get("pContent"));
        map.put("rContent2", courseTargetPointList.get(1).get("rContent"));
        map.put("courseTargetPoint2", courseTargetPointList.get(1).get("pContent"));
        map.put("rContent3", courseTargetPointList.get(2).get("rContent"));
        map.put("courseTargetPoint3", courseTargetPointList.get(2).get("pContent"));
        map.put("behaveFull", ordinaryClassDegreeMap.get("behaveFull"));
        map.put("homeworkFull", ordinaryClassDegreeMap.get("homeworkFull"));
        map.put("testFull", ordinaryClassDegreeMap.get("testFull"));
        map.put("behaveAvg", ordinaryClassDegreeMap.get("behaveAvg"));
        map.put("behaveLow", ordinaryClassDegreeMap.get("behaveLow"));
        map.put("behaveHigh",ordinaryClassDegreeMap.get("behaveHigh"));
        map.put("homeworkAvg", ordinaryClassDegreeMap.get("homeworkAvg"));
        map.put("homeworkLow", ordinaryClassDegreeMap.get("homeworkLow"));
        map.put("homeworkHigh", ordinaryClassDegreeMap.get("homeworkHigh"));
        map.put("testAvg", ordinaryClassDegreeMap.get("testAvg"));
        map.put("testLow", ordinaryClassDegreeMap.get("testLow"));
        map.put("testHigh", ordinaryClassDegreeMap.get("testHigh"));
        map.put("target1O", ordinaryClassDegreeMap.get("target1O"));
        map.put("target2O", ordinaryClassDegreeMap.get("target2O"));
        map.put("target3O", ordinaryClassDegreeMap.get("target3O"));
        map.put("totalO", ordinaryClassDegreeMap.get("totalO"));
        map.put("target1OFull", ordinaryClassDegreeMap.get("target1OFull"));
        map.put("target2OFull", ordinaryClassDegreeMap.get("target2OFull"));
        map.put("target3OFull", ordinaryClassDegreeMap.get("target3OFull"));
        map.put("behaveTarget1Weight", ordinaryClassDegreeMap.get("behaveTarget1Weight"));
        map.put("behaveTarget2Weight", ordinaryClassDegreeMap.get("behaveTarget2Weight"));
        map.put("behaveTarget3Weight", ordinaryClassDegreeMap.get("behaveTarget3Weight"));
        map.put("homeworkTarget1Weight", ordinaryClassDegreeMap.get("homeworkTarget1Weight"));
        map.put("homeworkTarget2Weight", ordinaryClassDegreeMap.get("homeworkTarget2Weight"));
        map.put("homeworkTarget3Weight", ordinaryClassDegreeMap.get("homeworkTarget3Weight"));
        map.put("testTarget1Weight", ordinaryClassDegreeMap.get("testTarget1Weight"));
        map.put("testTarget2Weight", ordinaryClassDegreeMap.get("testTarget2Weight"));
        map.put("testTarget3Weight", ordinaryClassDegreeMap.get("testTarget3Weight"));
        map.put("finalFull", finalClassDegreeMap.get("finalFull"));
        map.put("finalAvg", finalClassDegreeMap.get("finalAvg"));
        map.put("finalLow", finalClassDegreeMap.get("finalLow"));
        map.put("finalHigh", finalClassDegreeMap.get("finalHigh"));
        map.put("target1F", finalClassDegreeMap.get("target1F"));
        map.put("target2F", finalClassDegreeMap.get("target2F"));
        map.put("target3F", finalClassDegreeMap.get("target3F"));
        map.put("totalF", finalClassDegreeMap.get("totalF"));
        map.put("target1FFull", finalClassDegreeMap.get("target1FFull"));
        map.put("target2FFull", finalClassDegreeMap.get("target2FFull"));
        map.put("target3FFull", finalClassDegreeMap.get("target3FFull"));
        map.put("finalTarget1Weight", finalClassDegreeMap.get("finalTarget1Weight"));
        map.put("finalTarget2Weight", finalClassDegreeMap.get("finalTarget2Weight"));
        map.put("finalTarget3Weight", finalClassDegreeMap.get("finalTarget3Weight"));
        map.put("target1CommentO", totalClassDegreeMap.get("target1CommentO"));
        map.put("target2CommentO", totalClassDegreeMap.get("target2CommentO"));
        map.put("target3CommentO", totalClassDegreeMap.get("target3CommentO"));
        map.put("target1CommentF", totalClassDegreeMap.get("target1CommentF"));
        map.put("target2CommentF", totalClassDegreeMap.get("target2CommentF"));
        map.put("target3CommentF", totalClassDegreeMap.get("target3CommentF"));
        map.put("target1TotalComment", totalClassDegreeMap.get("target1TotalComment"));
        map.put("target2TotalComment", totalClassDegreeMap.get("target2TotalComment"));
        map.put("target3TotalComment", totalClassDegreeMap.get("target3TotalComment"));
        map.put("totalComment", totalClassDegreeMap.get("totalComment"));
        map.put("target1Avg", targetDegreeMap.get("target1Avg"));
        map.put("target2Avg", targetDegreeMap.get("target2Avg"));
        map.put("target3Avg", targetDegreeMap.get("target3Avg"));
        map.put("targetAvgSum", targetDegreeMap.get("targetAvgSum"));
        map.put("target1Comment", targetDegreeMap.get("target1Comment"));
        map.put("target2Comment", targetDegreeMap.get("target2Comment"));
        map.put("target3Comment", targetDegreeMap.get("target3Comment"));
        map.put("targetCommentSum", targetDegreeMap.get("targetCommentSum"));
        map.put("target1", targetMap.get("target1"));
        map.put("target2", targetMap.get("target2"));
        map.put("target3", targetMap.get("target3"));
        map.put("totalTarget1Weight", targetMap.get("totalTarget1Weight"));
        map.put("totalTarget2Weight", targetMap.get("totalTarget2Weight"));
        map.put("totalTarget3Weight", targetMap.get("totalTarget3Weight"));
        map.put("requirementTarget1", targetMap.get("requirementTarget1"));
        map.put("requirementTarget2", targetMap.get("requirementTarget2"));
        map.put("requirementTarget3", targetMap.get("requirementTarget3"));
        map.put("point1", targetMap.get("point1"));
        map.put("point2", targetMap.get("point2"));
        map.put("point3", targetMap.get("point3"));
        map.put("kAnalyse", kCommentMap.get("kAnalyse"));
        map.put("kImprovement", kCommentMap.get("kImprovement"));
        map.put("kCommentTName", kCommentMap.get("kCommentTName"));
        map.put("kCommentTime", kCommentMap.get("kCommentTime"));
        map.put("kSuggestion", kSuggestionMap.get("kSuggestion"));
        try {
            XWPFDocument doc = WordExportUtil.exportWord07(url, map);
            ServletOutputStream outputStream = response.getOutputStream();
            response.setHeader("Content-disposition", String.format("attachment; filename=%s", fileName));
            doc.write(outputStream);
            outputStream.close();
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
