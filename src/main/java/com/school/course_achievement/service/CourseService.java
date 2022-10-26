package com.school.course_achievement.service;

import com.school.course_achievement.pojo.GraduateRequirement;

import java.util.List;
import java.util.Map;

public interface CourseService {
    /**
     * 按课程号得到课程目标信息
     * @param KName
     * @return 课程目标信息集合
     */
    List<String> getCourseTargetByKName(String KName);

    /**
     * 按课程名搜索课程的毕业指标点
     * @param KName
     * @return 指标点序号
     */
    List<Map<String, String>> getCourseTargetPointByKName(String KName);

    /**
     *
     * @param KName
     * @return
     */
    public List<String> getCoursePoint(String KName);
}
