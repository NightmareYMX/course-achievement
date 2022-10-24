package com.school.course_achievement.service.impl;
import com.school.course_achievement.mapper.ClassDegreeMapper;
import com.school.course_achievement.mapper.WeightMapper;
import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.pojo.ClassDegreeExample;
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
    @Override
    public List<Map<String, Double>> getAllClassDegree(String KNo) {
        List<Map<String, Double>> degreeMapList = new ArrayList<>();
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria criteriaClassDegreeExample = classDegreeExample.createCriteria();
        criteriaClassDegreeExample.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        Map<String, Double> degreeMap = new HashMap<>();
        //未完成
        return degreeMapList;
    }
}
