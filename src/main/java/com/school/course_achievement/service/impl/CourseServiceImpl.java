package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.pojo.CourseExample;
import com.school.course_achievement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getAllCourse() {
        CourseExample courseExample = new CourseExample();
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        return courseList;
    }
}
