package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.Weight;
import com.school.course_achievement.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/weight")
public class weightController {

    @Autowired
    WeightService weightService;

    @RequestMapping("/getAllWeight")
    public String getWeight(Model model) {
        List<Weight> weightList = weightService.getAllWeight();
        model.addAttribute("weightList", weightList);
        return "weight";
    }

    @RequestMapping(value = "/toUpdate/{kNo}")
    public String updateWeightByKNo(@PathVariable("kNo") String kNo, Model model) {
        Weight weight = weightService.getWeightByKNo(kNo);
        model.addAttribute("weight", weight);
        return "weightUpdate";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(Weight weight) {
        weightService.updateWeight(weight);
        return "redirect:/weight";
    }
}
