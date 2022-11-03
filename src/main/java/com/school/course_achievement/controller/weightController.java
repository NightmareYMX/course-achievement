package com.school.course_achievement.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @RequestMapping("/getAllWeight/{pageNum}")
    public String getWeight(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 1);
        List<Weight> weightList = weightService.getAllWeight();
        PageInfo<Weight> pageInfo = new PageInfo<>(weightList, 3);
        model.addAttribute("page", pageInfo);
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
        return "redirect:/weight/getAllWeight/1";
    }
}
