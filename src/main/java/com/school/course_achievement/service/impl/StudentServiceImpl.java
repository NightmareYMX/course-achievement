package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.StudentMapper;
import com.school.course_achievement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int findUser(String username, String password) {
        return studentMapper.findUser(username, password);
    }
}
