package com.school.course_achievement.service;

import java.util.Map;

public interface ClassDegreeService {
    /**
     * 插入数据
     * @return 成功与否
     */
    int calculateDegreeOne();

    /**
     * 插入数据
     * @return 成功与否
     */
    int calculateDegreeTwo();

    /**
     * 按课程名查询所有的班级平时成绩
     * @param KName
     * @return 所有班级的平时成绩信息
     */
    Map<String, Double> getOrdinaryClassDegree(String KName);

    /**
     * 按课程名查询所有班级的大作业或者期末考试成绩
     * @param KName
     * @return 所有班级的作业或者期末考试成绩
     */
    Map<String, Double> getFinalClassDegree(String KName);

    /**
     * 按课程名查询所有班级的总体成绩
     * @param KName
     * @return
     */
    Map<String, Double> getTotalClassDegree(String KName);

    /**
     *
     * @param KName
     * @return
     */
    Map<String, Double> getTargetDegree(String KName);

    /**
     * @param KName
     * @return
     */
    Map<String, Double> getTargetWeight(String KName);

    /**
     *
     * @param KName
     * @return
     */
    Map<String, String> getKComment(String KName);

    /**
     *
     * @param KName
     * @param kAnalyse
     * @param kImprovement
     * @param kCommentTime
     * @return
     */
    public int submitComment(String KName, String kAnalyse, String kImprovement, String kCommentTime);
}
