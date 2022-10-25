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
    public List<Map<String, Double>> getOrdinaryClassDegree(String KName) {
        //按课程名获得课程号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameEqualTo(KName);
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();
        //按课程号获得课程分数
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
        if (classDegreeList.get(0).getcNo().equals("201")) {
            for (ClassDegree classDegree: classDegreeList) {
                Map<String, Double> degreeMap = new HashMap<String, Double>();
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
                degreeMap.put("behaveTarget2Weight", weight.getBehaveTarget2Weight());
                degreeMap.put("behaveTarget3Weight", weight.getBehaveTarget3Weight());
                degreeMap.put("homeworkTarget1Weight", weight.getHomeworkTarget1Weight());
                degreeMap.put("homeworkTarget2Weight", weight.getHomeworkTarget2Weight());
                degreeMap.put("homeworkTarget3Weight", weight.getHomeworkTarget3Weight());
                degreeMap.put("testTarget1Weight", weight.getTestTarget1Weight());
                degreeMap.put("testTarget2Weight", weight.getTestTarget2Weight());
                degreeMap.put("testTarget3Weight", weight.getTestTarget3Weight());
                degreeMapList.add(degreeMap);
            }
        } else {
            for (int i = classDegreeList.size() - 1; i >= 0; i --) {
                Map<String, Double> degreeMap = new HashMap<String, Double>();
                ClassDegree classDegree = classDegreeList.get(i);
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
                degreeMap.put("behaveTarget2Weight", weight.getBehaveTarget2Weight());
                degreeMap.put("behaveTarget3Weight", weight.getBehaveTarget3Weight());
                degreeMap.put("homeworkTarget1Weight", weight.getHomeworkTarget1Weight());
                degreeMap.put("homeworkTarget2Weight", weight.getHomeworkTarget2Weight());
                degreeMap.put("homeworkTarget3Weight", weight.getHomeworkTarget3Weight());
                degreeMap.put("testTarget1Weight", weight.getTestTarget1Weight());
                degreeMap.put("testTarget2Weight", weight.getTestTarget2Weight());
                degreeMap.put("testTarget3Weight", weight.getTestTarget3Weight());
                degreeMapList.add(degreeMap);
            }
        }
        return degreeMapList;
    }

    @Override
    public List<Map<String, Double>> getFinalClassDegree(String KName) {
        //未完成
        return null;
    }
}
