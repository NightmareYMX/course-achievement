package com.school.course_achievement.service;

import java.util.List;
import java.util.Map;

public interface ClassDegreeService {
    /**
     * 按课程号查询所有的班级平时成绩
     * @return 所有班级的所有平时成绩信息
     */
    List<Map<String, Double>> getAllClassDegree(String KName);
}
