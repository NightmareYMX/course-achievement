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
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        if (!courseList.isEmpty()) {
            Course course = courseList.get(0);

            GraduateRequirementExample graduateRequirementExampleOne = new GraduateRequirementExample();
            GraduateRequirementExample.Criteria graduateRequirementExampleCriteriaOne = graduateRequirementExampleOne.createCriteria();

            graduateRequirementExampleCriteriaOne.andPContentLike("%" + course.getkTarget1Point() + "%");
            List<GraduateRequirement> graduateRequirementListOne = graduateRequirementMapper.selectByExample(graduateRequirementExampleOne);
            GraduateRequirement graduateRequirementOne = new GraduateRequirement();
            GraduateRequirement graduateRequirementTwo = new GraduateRequirement();
            GraduateRequirement graduateRequirementThree = new GraduateRequirement();

            if (!graduateRequirementListOne.isEmpty()){
                graduateRequirementOne = graduateRequirementListOne.get(0);
            }
            GraduateRequirementExample graduateRequirementExampleTwo = new GraduateRequirementExample();
            GraduateRequirementExample.Criteria graduateRequirementExampleCriteriaTwo = graduateRequirementExampleTwo.createCriteria();
            graduateRequirementExampleCriteriaTwo.andPContentLike("%" + course.getkTarget2Point() + "%");
            List<GraduateRequirement> graduateRequirementListTwo = graduateRequirementMapper.selectByExample(graduateRequirementExampleTwo);
            if (!graduateRequirementListTwo.isEmpty()){
                graduateRequirementTwo = graduateRequirementListTwo.get(0);
            }
            GraduateRequirementExample graduateRequirementExampleThree = new GraduateRequirementExample();
            GraduateRequirementExample.Criteria graduateRequirementExampleCriteriaThree = graduateRequirementExampleThree.createCriteria();
            graduateRequirementExampleCriteriaThree.andPContentLike("%" + course.getkTarget3Point() + "%");
            List<GraduateRequirement> graduateRequirementListThree = graduateRequirementMapper.selectByExample(graduateRequirementExampleThree);
            if (!graduateRequirementListThree.isEmpty()){
                graduateRequirementThree = graduateRequirementListThree.get(0);
            }
            graduateRequirementList.add(graduateRequirementOne);
            graduateRequirementList.add(graduateRequirementTwo);
            graduateRequirementList.add(graduateRequirementThree);
            return graduateRequirementList;
        }
        return null;
    }
}
