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
        weightExampleCriteria.andKNoEqualTo(KNo);
        List<Weight> weightList = weightMapper.selectByExample(weightExample);
        Weight weight = weightList.get(0);
        List<Map<String, Double>> degreeMapList = new ArrayList<>();
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        for (ClassDegree classDegree: classDegreeList) {
            degreeMap.put("behaveAvg", classDegree.getdBehaveAvg());
            degreeMap.put("behaveLow", classDegree.getdBehaveLow());
            degreeMap.put("behaveHigh", classDegree.getdBehaveHigh());
            degreeMap.put("homeworkAvg", classDegree.getdHomeworkAvg());
            degreeMap.put("homeworkLow", classDegree.getdBehaveLow());
            degreeMap.put("homeworkHigh", classDegree.getdHomeworkHigh());
            degreeMap.put("testAvg", classDegree.getdTestAvg());
            degreeMap.put("testLow", classDegree.getdTestLow());
            degreeMap.put("testHigh", classDegree.getdTestHigh());
            degreeMap.put("behaveTarget1Weight", weight.getBehaveTarget1Weight());
            degreeMapList.add(degreeMap);
        }
        //未完成
        return degreeMapList;
    }
}
