package com.school.course_achievement.service;

import com.school.course_achievement.pojo.Course;

import java.util.List;

public interface CourseService {
    /**
     * 搜索所有的课程
     * @return 课程集合
     */
    List<Course> getAllCourse();

}
