package com.school.course_achievement.service.Impl;

import com.school.course_achievement.mapper.ClassDegreeMapper;
import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.pojo.ClassDegreeExample;
import com.school.course_achievement.service.ClassDegreeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClassDegreeServiceImpl implements ClassDegreeService {
    @Autowired
    ClassDegreeMapper classDegreeMapper;
    @Override
    public List<ClassDegree> getAllClassDegree(String KNo) {
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria criteria = classDegreeExample.createCriteria();
        criteria.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        return classDegreeList;
    }
}
