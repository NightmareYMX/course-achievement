package com.school.course_achievement.service;

import com.school.course_achievement.pojo.GraduateRequirement;

import java.util.List;

public interface CourseService {
    /**
     * 搜索所有的课程
     * @return 课程集合
     */
    List<String> getAllCourseName();

    /**
     * 按课程号得到课程目标信息
     * @param KNo
     * @return 课程目标信息集合
     */
    List<String> getCourseTargetByKNo(String KNo);

    /**
     * 按课程名搜索课程的毕业指标点
     * @param KName
     * @return 指标点序号
     */
    List<GraduateRequirement> getCourseTargetPointByKName(String KName);
}
