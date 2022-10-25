package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.mapper.GraduateRequirementMapper;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.pojo.CourseExample;
import com.school.course_achievement.pojo.GraduateRequirement;
import com.school.course_achievement.pojo.GraduateRequirementExample;
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

    @Autowired
    GraduateRequirementMapper graduateRequirementMapper;

    @Override
    public List<String> getCourseTargetByKName(String KName) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        List<String> targetList = new ArrayList<>();
        if (!courseList.isEmpty()){
            Course course = courseList.get(0);
            targetList.add(course.getkTarget1());
            targetList.add(course.getkTarget2());
            targetList.add(course.getkTarget3());
            return targetList;
        }
        return null;
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

    @Override
    public List<GraduateRequirement> getCourseTargetPointByKName(String KName) {
        List<GraduateRequirement> graduateRequirementList = new ArrayList<GraduateRequirement>();
        //根据课程名KName查询课程的毕业指标点序号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameEqualTo(KName);
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        if (!courseList.isEmpty()) {
            Course course = courseList.get(0);

            GraduateRequirementExample graduateRequirementExample = new GraduateRequirementExample();
            GraduateRequirementExample.Criteria graduateRequirementExampleCriteria = graduateRequirementExample.createCriteria();

            graduateRequirementExampleCriteria.andPContentLike(course.getkTarget1Point() + "%");
            List<GraduateRequirement> graduateRequirementListOne = graduateRequirementMapper.selectByExample(graduateRequirementExample);
            GraduateRequirement graduateRequirementOne = graduateRequirementListOne.get(0);
            graduateRequirementExample.clear();

            graduateRequirementExampleCriteria.andPContentLike(course.getkTarget2Point() + "%");
            List<GraduateRequirement> graduateRequirementListTwo = graduateRequirementMapper.selectByExample(graduateRequirementExample);
            GraduateRequirement graduateRequirementTwo = graduateRequirementListTwo.get(0);
            graduateRequirementExample.clear();

            graduateRequirementExampleCriteria.andPContentLike(course.getkTarget3Point() + "%");
            List<GraduateRequirement> graduateRequirementListThree = graduateRequirementMapper.selectByExample(graduateRequirementExample);
            GraduateRequirement graduateRequirementThree = graduateRequirementListThree.get(0);

            graduateRequirementList.add(graduateRequirementOne);
            graduateRequirementList.add(graduateRequirementTwo);
            graduateRequirementList.add(graduateRequirementThree);
            return graduateRequirementList;
        }
        return null;
    }
}
