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

import javax.servlet.http.HttpSession;
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
    public String update(Weight weight, HttpSession session) {
        Double behaveTarget1Weight = weight.getBehaveTarget1Weight();
        Double behaveTarget2Weight = weight.getBehaveTarget2Weight();
        Double behaveTarget3Weight = weight.getBehaveTarget3Weight();
        Double homeworkTarget1Weight = weight.getHomeworkTarget1Weight();
        Double homeworkTarget2Weight = weight.getHomeworkTarget2Weight();
        Double homeworkTarget3Weight = weight.getHomeworkTarget3Weight();
        Double testTarget1Weight = weight.getTestTarget1Weight();
        Double testTarget2Weight = weight.getTestTarget2Weight();
        Double testTarget3Weight = weight.getTestTarget3Weight();
        Double finalTarget1Weight = weight.getFinalTarget1Weight();
        Double finalTarget2Weight = weight.getFinalTarget2Weight();
        Double finalTarget3Weight = weight.getFinalTarget3Weight();
        Double totalTarget1Weight = weight.getTotalTarget1Weight();
        Double totalTarget2Weight = weight.getTotalTarget2Weight();
        Double totalTarget3Weight = weight.getTotalTarget3Weight();
        if (behaveTarget1Weight + behaveTarget2Weight + behaveTarget3Weight != 1
                || homeworkTarget1Weight + homeworkTarget2Weight + homeworkTarget3Weight != 1
                || testTarget1Weight + testTarget2Weight + testTarget3Weight != 1
                || finalTarget1Weight + finalTarget2Weight + finalTarget3Weight != 1
                || totalTarget1Weight + totalTarget2Weight + totalTarget3Weight != 1
        ) {
            session.setAttribute("updateWeightMsg", "修改失败，三个目标权重之和必须等于1!");
            return String.format("redirect:/weight/toUpdate/%s", weight.getkNo());
        } else {
            session.removeAttribute("updateWeightMsg");
            weightService.updateWeight(weight);
            return "redirect:/weight/getAllWeight/1";
        }
    }
}
