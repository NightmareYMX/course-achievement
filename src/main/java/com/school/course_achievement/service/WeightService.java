package com.school.course_achievement.service;

import com.school.course_achievement.pojo.Weight;

import java.util.List;

public interface WeightService {
    /**
     *
     * @return
     */
    public List<Weight> getAllWeight();

    /**
     *
     * @param kNo
     * @return
     */
    public Weight getWeightByKNo(String kNo);

    public void updateWeight(Weight weight);
}
