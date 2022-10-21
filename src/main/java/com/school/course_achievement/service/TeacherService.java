package com.school.course_achievement.service;

import com.school.course_achievement.pojo.Teacher;

public interface TeacherService {
    /**
     * 教师登录
     * @param teacher
     * @return (int)查询到教师信息为1，查询不到信息为0
     */
    int teacherLogin(Teacher teacher);


}
