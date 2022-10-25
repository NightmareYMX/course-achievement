package com.school.course_achievement.service;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.Map;

public interface ClassDegreeService {
    /**
     *
     * @return 成功与否
     */
    int calculateDegreeOne();

    /**
     *
     * @return 成功与否
     */
    int calculateDegreeTwo();

    /**
     * 按课程名查询所有的班级平时成绩
     * @param KName
     * @return 所有班级的平时成绩信息
     */
    List<Map<String, Double>> getOrdinaryClassDegree(String KName);

    /**
     * 按课程名查询所有班级的大作业或者期末考试成绩
     * @param KName
     * @return 所有班级的作业或者期末考试成绩
     */
    List<Map<String, Double>> getFinalClassDegree(String KName);
}
