package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.pojo.CourseExample;
import com.school.course_achievement.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    CourseMapper courseMapper;
    @Override
    public List<Course> getWord() {
        CourseExample courseExample = new CourseExample();
        return courseMapper.selectByExample(courseExample);
    }
}
