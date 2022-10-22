package com.school.course_achievement.service.impl;
import com.school.course_achievement.mapper.ClassDegreeMapper;
import com.school.course_achievement.mapper.StudentDegreeMapper;
import com.school.course_achievement.mapper.StudentMapper;
import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.pojo.ClassDegreeExample;
import com.school.course_achievement.pojo.StudentDegree;
import com.school.course_achievement.pojo.StudentDegreeExample;
import com.school.course_achievement.service.ClassDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ClassDegreeServiceImpl implements ClassDegreeService {
    List<ClassDegree> classDegreeList;
    @Autowired
    ClassDegreeMapper classDegreeMapper;
    @Autowired
    StudentDegreeMapper studentDegreeMapper;
    @Autowired
    StudentMapper studentMapper;


    @Override
    public List<ClassDegree> getAllClassDegree(String KNo) {
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria criteriaClassDegreeExample = classDegreeExample.createCriteria();
        criteriaClassDegreeExample.andKNoEqualTo(KNo);
        classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        while (classDegreeList.isEmpty()) {
            StudentDegreeExample studentDegreeExample = new StudentDegreeExample();
            StudentDegreeExample.Criteria criteria1StudentDegreeExample = studentDegreeExample.createCriteria();
            criteria1StudentDegreeExample.andKNoEqualTo(KNo);
            List<StudentDegree> studentDegreeList = studentDegreeMapper.selectByExample(studentDegreeExample);
            int size = studentDegreeList.size();
            for (StudentDegree studentDegree: studentDegreeList) {

            }
//            classDegreeList.add();
        }
        return classDegreeList;
    }
}
