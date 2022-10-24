package com.school.course_achievement.service;

import com.school.course_achievement.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 教师登录
     * @param teacher
     * @return 返回查询教师信息的集合
     */
    List<Teacher> teacherLogin(Teacher teacher);


}
