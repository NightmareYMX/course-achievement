package com.school.course_achievement.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WordController {
    @Autowired
    WordService wordService;
    @RequestMapping("/word/{pageNum}")
    public String getWord(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 5);
        List<Course> wordList = wordService.getWord();
        PageInfo<Course> pageInfo = new PageInfo<>(wordList, 3);
        model.addAttribute("page", pageInfo);
        model.addAttribute("wordList", wordList);
        for (Course course: wordList) {

            System.out.println(course.getkName());
        }
        return "word";
    }
}
