package com.school.course_achievement.service.impl;
import com.school.course_achievement.mapper.ClassDegreeMapper;
import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.pojo.ClassDegreeExample;
import com.school.course_achievement.service.ClassDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassDegreeServiceImpl implements ClassDegreeService {
    List<ClassDegree> classDegreeList;
    @Autowired
    ClassDegreeMapper classDegreeMapper;

    @Override
    public List<ClassDegree> getAllClassDegree(String KNo) {
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria criteriaClassDegreeExample = classDegreeExample.createCriteria();
        criteriaClassDegreeExample.andKNoEqualTo(KNo);
        classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        return classDegreeList;
    }
}
