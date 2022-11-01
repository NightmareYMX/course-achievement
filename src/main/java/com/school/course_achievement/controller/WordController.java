package com.school.course_achievement.controller;

import com.school.course_achievement.pojo.Course;
import com.school.course_achievement.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WordController {
    @Autowired
    WordService wordService;
    @RequestMapping("/word")
    public String getWord(Model model) {
        List<Course> wordList = wordService.getWord();
        model.addAttribute("wordList", wordList);
        return "word";
    }
}
