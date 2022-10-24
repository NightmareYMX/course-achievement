package com.school.course_achievement.service.impl;
import com.school.course_achievement.mapper.ClassDegreeMapper;
import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.mapper.WeightMapper;
import com.school.course_achievement.pojo.*;
import com.school.course_achievement.service.ClassDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ClassDegreeServiceImpl implements ClassDegreeService {

    @Autowired
    ClassDegreeMapper classDegreeMapper;

    @Autowired
    WeightMapper weightMapper;

    @Autowired
    CourseMapper courseMapper;
    @Override
    public List<Map<String, Double>> getAllClassDegree(String KName) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameEqualTo(KName);
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();

        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria criteriaClassDegreeExample = classDegreeExample.createCriteria();
        criteriaClassDegreeExample.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);

        WeightExample weightExample = new WeightExample();
        WeightExample.Criteria weightExampleCriteria = weightExample.createCriteria();
        List<Map<String, Double>> degreeMapList = new ArrayList<>();
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        //未完成
        return degreeMapList;
    }
}
