package com.school.course_achievement.service.impl;

import com.school.course_achievement.mapper.CourseMapper;
import com.school.course_achievement.mapper.WeightMapper;
import com.school.course_achievement.pojo.Weight;
import com.school.course_achievement.pojo.WeightExample;
import com.school.course_achievement.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeightServiceImpl implements WeightService {
    @Autowired
    CourseMapper courseMapper;

    @Autowired
    WeightMapper weightMapper;
    @Override
    public List<Weight> getAllWeight() {
        return weightMapper.selectByExample(null);
    }

    @Override
    public Weight getWeightByKNo(String kNo) {
        WeightExample weightExample = new WeightExample();
        WeightExample.Criteria weightExampleCriteria = weightExample.createCriteria();
        weightExampleCriteria.andKNoEqualTo(kNo);
        List<Weight> weightList = weightMapper.selectByExample(weightExample);
        return weightList.get(0);
    }

    @Override
    public void updateWeight(Weight weight) {
        WeightExample weightExample = new WeightExample();
        WeightExample.Criteria weightExampleCriteria = weightExample.createCriteria();
        weightExampleCriteria.andKNoEqualTo(weight.getkNo());
        weightMapper.updateByExample(weight, weightExample);
    }
}
