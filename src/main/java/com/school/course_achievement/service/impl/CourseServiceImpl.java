package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.pojo.CourseExample;
import com.school.course_achievement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<String> getCourseTargetByKNo(String KNo) {
        Course course = courseMapper.selectByPrimaryKey(KNo);
        List<String> targetList = new ArrayList<>();
        targetList.add(course.getkTarget1());
        targetList.add(course.getkTarget2());
        targetList.add(course.getkTarget3());
        return targetList;
    }

    @Override
    public List<String> getAllCourseName() {
        CourseExample courseExample = new CourseExample();
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        List<String> nameList = new ArrayList<>();
        for (Course course: courseList) {
            nameList.add(course.getkName());
        }
        return nameList;
    }
}
