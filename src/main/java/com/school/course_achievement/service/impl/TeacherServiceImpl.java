package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.TeacherMapper;
import com.school.course_achievement.pojo.Teacher;
import com.school.course_achievement.pojo.TeacherExample;
import com.school.course_achievement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public int teacherLogin(Teacher teacher) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTNoEqualTo(teacher.gettNo());
        criteria.andTPasswordEqualTo(teacher.gettPassword());
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        if (teacherList.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }
}
