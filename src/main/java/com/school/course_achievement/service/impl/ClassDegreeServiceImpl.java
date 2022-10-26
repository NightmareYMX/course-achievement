package com.school.course_achievement.service.impl;
import com.school.course_achievement.mapper.*;
import com.school.course_achievement.pojo.*;
import com.school.course_achievement.service.ClassDegreeService;
import com.school.course_achievement.utils.DegreeUtils;
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

    @Autowired
    StudentDegreeMapper studentDegreeMapper;
    @Override
    public int calculateDegreeOne() {
        int insert = 1;
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        if (classDegreeList.size() <= 2) {
            ClassDegreeExample classDegreeExampleDel = new ClassDegreeExample();
            ClassDegreeExample.Criteria criteria = classDegreeExampleDel.createCriteria();
            criteria.andKNoEqualTo("25001");
            criteria.andKNoEqualTo("25002");
            classDegreeMapper.deleteByExample(classDegreeExample);
            StudentDegreeExample studentDegreeExampleOne = new StudentDegreeExample();
            StudentDegreeExample.Criteria studentDegreeExampleOneCriteria = studentDegreeExampleOne.createCriteria();
            studentDegreeExampleOneCriteria.andKNoEqualTo("25001");
            List<StudentDegree> studentDegreeOneList = studentDegreeMapper.selectByExample(studentDegreeExampleOne);
            List<Double> BehaveOneList = new ArrayList<>();
            List<Double> homeworkOneList = new ArrayList<>();
            List<Double> testOneList = new ArrayList<>();
            List<Double> finalOneList = new ArrayList<>();
            List<Double> target1OneList = new ArrayList<>();
            List<Double> target2OneList = new ArrayList<>();
            List<Double> target3OneList = new ArrayList<>();
            for (StudentDegree studentDegree: studentDegreeOneList) {
                BehaveOneList.add(studentDegree.getBehaveDegree());
                homeworkOneList.add(studentDegree.getHomeworkDegree());
                testOneList.add(studentDegree.getTestDegree());
                finalOneList.add(studentDegree.getFinalDegree());
                target1OneList.add(studentDegree.getTarget1Degree());
                target2OneList.add(studentDegree.getTarget2Degree());
                target3OneList.add(studentDegree.getTarget3Degree());
            }
            WeightExample weightExample = new WeightExample();
            List<Weight> weightList = weightMapper.selectByExample(weightExample);
            Weight weightOne = weightList.get(0);
            double behaveAvg = DegreeUtils.avgDegree(BehaveOneList);
            double behaveLow = DegreeUtils.lowDegree(BehaveOneList);
            double behaveHigh = DegreeUtils.highDegree(BehaveOneList);
            double homeworkAvg = DegreeUtils.avgDegree(homeworkOneList);
            double homeworkLow = DegreeUtils.lowDegree(homeworkOneList);
            double homeworkHigh = DegreeUtils.highDegree(homeworkOneList);
            double testAvg = DegreeUtils.avgDegree(testOneList);
            double testLow = DegreeUtils.lowDegree(testOneList);
            double testHigh = DegreeUtils.highDegree(testOneList);
            double finalAvg = DegreeUtils.avgDegree(finalOneList);
            double finalLow = DegreeUtils.lowDegree(finalOneList);
            double finalHigh = DegreeUtils.highDegree(finalOneList);
            double target1Avg = DegreeUtils.avgDegree(target1OneList);
            double target2Avg = DegreeUtils.avgDegree(target2OneList);
            double target3Avg = DegreeUtils.avgDegree(target3OneList);
            double target1O = weightOne.getBehaveTarget1Weight() * behaveAvg + weightOne.getHomeworkTarget1Weight() * homeworkAvg + weightOne.getTestTarget1Weight() * testAvg;
            double target2O = weightOne.getBehaveTarget2Weight() * behaveAvg + weightOne.getHomeworkTarget2Weight() * homeworkAvg + weightOne.getTestTarget2Weight() * testAvg;
            double target3O = weightOne.getBehaveTarget3Weight() * behaveAvg + weightOne.getHomeworkTarget3Weight() * homeworkAvg + weightOne.getTestTarget3Weight() * testAvg;
            double target1F = weightOne.getFinalTarget1Weight() * finalAvg;
            double target2F = weightOne.getFinalTarget2Weight() * finalAvg;
            double target3F = weightOne.getFinalTarget3Weight() * finalAvg;
            ClassDegree classDegreeOne = new ClassDegree(
                    "25001",
                    "201",
                    behaveAvg,
                    behaveLow,
                    behaveHigh,
                    homeworkAvg,
                    homeworkLow,
                    homeworkHigh,
                    testAvg,
                    testLow,
                    testHigh,
                    finalAvg,
                    finalLow,
                    finalHigh,
                    target1Avg,
                    target2Avg,
                    target3Avg,
                    target1O,
                    target2O,
                    target3O,
                    target1O + target2O + target3O,
                    target1F,
                    target2F,
                    target3F,
                    target1F + target2F + target3F,
                    null,
                    null,
                    null);
            insert = classDegreeMapper.insert(classDegreeOne);
            return insert;
        }
        return insert;
    }

    @Override
    public int calculateDegreeTwo() {
        int insert = 1;
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        if (classDegreeList.size() <= 2) {
            StudentDegreeExample studentDegreeExampleTwo = new StudentDegreeExample();
            StudentDegreeExample.Criteria studentDegreeExampleTwoCriteria = studentDegreeExampleTwo.createCriteria();
            studentDegreeExampleTwoCriteria.andKNoEqualTo("25002");
            List<StudentDegree> studentDegreeTwoList = studentDegreeMapper.selectByExample(studentDegreeExampleTwo);
            List<Double> BehaveTwoList = new ArrayList<>();
            List<Double> homeworkTwoList = new ArrayList<>();
            List<Double> testTwoList = new ArrayList<>();
            List<Double> finalTwoList = new ArrayList<>();
            List<Double> target1TwoList = new ArrayList<>();
            List<Double> target2TwoList = new ArrayList<>();
            List<Double> target3TwoList = new ArrayList<>();
            for (StudentDegree studentDegree: studentDegreeTwoList) {
                BehaveTwoList.add(studentDegree.getBehaveDegree());
                homeworkTwoList.add(studentDegree.getHomeworkDegree());
                testTwoList.add(studentDegree.getTestDegree());
                finalTwoList.add(studentDegree.getFinalDegree());
                target1TwoList.add(studentDegree.getTarget1Degree());
                target2TwoList.add(studentDegree.getTarget2Degree());
                target3TwoList.add(studentDegree.getTarget3Degree());
            }
            WeightExample weightExample = new WeightExample();
            List<Weight> weightList = weightMapper.selectByExample(weightExample);
            Weight weightTwo = weightList.get(1);
            double behaveTwoAvg = DegreeUtils.avgDegree(BehaveTwoList);
            double behaveTwoLow = DegreeUtils.lowDegree(BehaveTwoList);
            double behaveTwoHigh = DegreeUtils.highDegree(BehaveTwoList);
            double homeworkTwoAvg = DegreeUtils.avgDegree(homeworkTwoList);
            double homeworkTwoLow = DegreeUtils.lowDegree(homeworkTwoList);
            double homeworkTwoHigh = DegreeUtils.highDegree(homeworkTwoList);
            double testTwoAvg = DegreeUtils.avgDegree(testTwoList);
            double testTwoLow = DegreeUtils.lowDegree(testTwoList);
            double testTwoHigh = DegreeUtils.highDegree(testTwoList);
            double finalTwoAvg = DegreeUtils.avgDegree(finalTwoList);
            double finalTwoLow = DegreeUtils.lowDegree(finalTwoList);
            double finalTwoHigh = DegreeUtils.highDegree(finalTwoList);
            double target1TwoAvg = DegreeUtils.avgDegree(target1TwoList);
            double target2TwoAvg = DegreeUtils.avgDegree(target2TwoList);
            double target3TwoAvg = DegreeUtils.avgDegree(target3TwoList);
            double target1TwoO = weightTwo.getBehaveTarget1Weight() * behaveTwoAvg + weightTwo.getHomeworkTarget1Weight() * homeworkTwoAvg + weightTwo.getTestTarget1Weight() * testTwoAvg;
            double target2TwoO = weightTwo.getBehaveTarget2Weight() * behaveTwoAvg + weightTwo.getHomeworkTarget2Weight() * homeworkTwoAvg + weightTwo.getTestTarget2Weight() * testTwoAvg;
            double target3TwoO = weightTwo.getBehaveTarget3Weight() * behaveTwoAvg + weightTwo.getHomeworkTarget3Weight() * homeworkTwoAvg + weightTwo.getTestTarget3Weight() * testTwoAvg;
            double target1TwoF = weightTwo.getFinalTarget1Weight() * finalTwoAvg;
            double target2TwoF = weightTwo.getFinalTarget2Weight() * finalTwoAvg;
            double target3TwoF = weightTwo.getFinalTarget3Weight() * finalTwoAvg;
            ClassDegree classDegreeTwo = new ClassDegree(
                    "25002",
                    "201",
                    behaveTwoAvg,
                    behaveTwoLow,
                    behaveTwoHigh,
                    homeworkTwoAvg,
                    homeworkTwoLow,
                    homeworkTwoHigh,
                    testTwoAvg,
                    testTwoLow,
                    testTwoHigh,
                    finalTwoAvg,
                    finalTwoLow,
                    finalTwoHigh,
                    target1TwoAvg,
                    target2TwoAvg,
                    target3TwoAvg,
                    target1TwoO,
                    target2TwoO,
                    target3TwoO,
                    target1TwoO + target2TwoO + target3TwoO,
                    target1TwoF,
                    target2TwoF,
                    target3TwoF,
                    target1TwoF + target2TwoF + target3TwoF,
                    null,
                    null,
                    null);
            insert = classDegreeMapper.insert(classDegreeTwo);
        }
        return insert;
    }

    @Override
    public Map<String, Double> getOrdinaryClassDegree(String KName) {
        //按课程名获得课程号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();
        //按课程号获得课程分数
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria classDegreeExampleCriteria = classDegreeExample.createCriteria();
        classDegreeExampleCriteria.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        ClassDegree classDegree = classDegreeList.get(0);
        WeightExample weightExample = new WeightExample();
        WeightExample.Criteria weightExampleCriteria = weightExample.createCriteria();
        weightExampleCriteria.andKNoEqualTo(KNo);
        List<Weight> weightList = weightMapper.selectByExample(weightExample);
        Weight weight = weightList.get(0);
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        degreeMap.put("behaveFull", 20.00);
        degreeMap.put("homeworkFull", 20.00);
        degreeMap.put("testFull", 60.00);
        degreeMap.put("behaveAvg", classDegree.getdBehaveAvg());
        degreeMap.put("behaveLow", classDegree.getdBehaveLow());
        degreeMap.put("behaveHigh", classDegree.getdBehaveHigh());
        degreeMap.put("homeworkAvg", classDegree.getdHomeworkAvg());
        degreeMap.put("homeworkLow", classDegree.getdBehaveLow());
        degreeMap.put("homeworkHigh", classDegree.getdHomeworkHigh());
        degreeMap.put("testAvg", classDegree.getdTestAvg());
        degreeMap.put("testLow", classDegree.getdTestLow());
        degreeMap.put("testHigh", classDegree.getdTestHigh());
        degreeMap.put("target1O", classDegree.getdTarget1O());
        degreeMap.put("target2O", classDegree.getdTarget2O());
        degreeMap.put("target3O", classDegree.getdTarget3O());
        degreeMap.put("totalO", classDegree.getdTotalO());
        degreeMap.put("behaveTarget1Weight", weight.getBehaveTarget1Weight());
        degreeMap.put("behaveTarget2Weight", weight.getBehaveTarget2Weight());
        degreeMap.put("behaveTarget3Weight", weight.getBehaveTarget3Weight());
        degreeMap.put("homeworkTarget1Weight", weight.getHomeworkTarget1Weight());
        degreeMap.put("homeworkTarget2Weight", weight.getHomeworkTarget2Weight());
        degreeMap.put("homeworkTarget3Weight", weight.getHomeworkTarget3Weight());
        degreeMap.put("testTarget1Weight", weight.getTestTarget1Weight());
        degreeMap.put("testTarget2Weight", weight.getTestTarget2Weight());
        degreeMap.put("testTarget3Weight", weight.getTestTarget3Weight());
        return degreeMap;
    }

    @Override
    public Map<String, Double> getFinalClassDegree(String KName) {
        //按课程名获得课程号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();
        //按课程号获得课程分数
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria classDegreeExampleCriteria = classDegreeExample.createCriteria();
        classDegreeExampleCriteria.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        ClassDegree classDegree = classDegreeList.get(0);
        WeightExample weightExample = new WeightExample();
        WeightExample.Criteria weightExampleCriteria = weightExample.createCriteria();
        weightExampleCriteria.andKNoEqualTo(KNo);
        List<Weight> weightList = weightMapper.selectByExample(weightExample);
        Weight weight = weightList.get(0);
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        degreeMap.put("finalFull", 100.00);
        degreeMap.put("finalAvg", classDegree.getdFinalAvg());
        degreeMap.put("finalLow", classDegree.getdFinalLow());
        degreeMap.put("finalHigh", classDegree.getdFinalHigh());
        degreeMap.put("target1F", classDegree.getdTarget1F());
        degreeMap.put("target2F", classDegree.getdTarget2F());
        degreeMap.put("target3F", classDegree.getdTarget3F());
        degreeMap.put("totalF", classDegree.getdTotalF());
        degreeMap.put("finalTarget1Weight", weight.getFinalTarget1Weight());
        degreeMap.put("finalTarget2Weight", weight.getFinalTarget2Weight());
        degreeMap.put("finalTarget3Weight", weight.getFinalTarget3Weight());
        return degreeMap;
    }

    @Override
    public Map<String, Double> getTotalClassDegree(String KName) {
        //按课程名获得课程号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();
        //按课程号获得课程分数
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria classDegreeExampleCriteria = classDegreeExample.createCriteria();
        classDegreeExampleCriteria.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        ClassDegree classDegree = classDegreeList.get(0);
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        degreeMap.put("target1O", classDegree.getdTarget1O());
        degreeMap.put("target2O", classDegree.getdTarget2O());
        degreeMap.put("target3O", classDegree.getdTarget3O());
        degreeMap.put("totalO", classDegree.getdTotalO());
        degreeMap.put("target1F", classDegree.getdTarget1F());
        degreeMap.put("target2F", classDegree.getdTarget2F());
        degreeMap.put("target3F", classDegree.getdTarget3F());
        degreeMap.put("totalF", classDegree.getdTotalF());
        return degreeMap;
    }

    @Override
    public Map<String, Double> getTargetDegree(String KName) {
        //按课程名获得课程号
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria courseExampleCriteria = courseExample.createCriteria();
        courseExampleCriteria.andKNameLike("%" + KName + "%");
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        String KNo = courseList.get(0).getkNo();
        //按课程号获得课程分数
        ClassDegreeExample classDegreeExample = new ClassDegreeExample();
        ClassDegreeExample.Criteria classDegreeExampleCriteria = classDegreeExample.createCriteria();
        classDegreeExampleCriteria.andKNoEqualTo(KNo);
        List<ClassDegree> classDegreeList = classDegreeMapper.selectByExample(classDegreeExample);
        ClassDegree classDegree = classDegreeList.get(0);
        Map<String, Double> degreeMap = new HashMap<String, Double>();
        degreeMap.put("target1Avg", classDegree.getdTarget1Avg());
        degreeMap.put("target2Avg", classDegree.getdTarget2Avg());
        degreeMap.put("target3Avg", classDegree.getdTarget3Avg());
        return degreeMap;
    }
}
