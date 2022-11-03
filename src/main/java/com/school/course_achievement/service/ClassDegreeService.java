package com.school.course_achievement.service;

import com.school.course_achievement.pojo.ClassDegree;

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
     * @param kNo
     * @return
     */
    Map<String, String> getKComment(String kNo);

    /**
     *
     * @param kNo
     * @param kAnalyse
     * @param kImprovement
     * @param kCommentTName
     * @param kCommentTime
     * @return
     */
    public int submitComment(String kNo, String kAnalyse, String kImprovement, String kCommentTName, String kCommentTime);

    /**
     *
     * @param KNo
     * @param kSuggestion
     * @return
     */
    public int submitSuggestion(String KNo, String kSuggestion);

    /**
     *
     * @param kNo
     * @return
     */
    public Map<String, String> getKSuggestion(String kNo);


}
