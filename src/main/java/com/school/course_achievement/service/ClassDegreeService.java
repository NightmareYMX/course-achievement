package com.school.course_achievement.service;

import com.school.course_achievement.pojo.ClassDegree;

import java.util.List;

public interface ClassDegreeService {
    /**
     * 按课程号查询所有的班级分数
     * @return 所有班级的所有成绩信息
     */
    List<ClassDegree> getAllClassDegree(String KNo);
}
