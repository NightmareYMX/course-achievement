package com.school.course_achievement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Lee
 * @date: 10:14
 * @description:
 */
@Controller
public class CommonController {
    @RequestMapping("/computer")
    public String jumpToComputer() {
        return "computer";
    }

    @RequestMapping("/login")
    public String jumpToLogin() {
        return "login";
    }

    @RequestMapping("/default")
    public String jumpToDefault() {
        return "default";
    }

    @RequestMapping("/error")
    public String jumpToError() {
        return "error";
    }

    @RequestMapping("/filelist")
    public String jumpToFileList() {
        return "filelist";
    }

    @RequestMapping("/form")
    public String jumpToForm() {
        return "form";
    }

    @RequestMapping("/imglist")
    public String jumpToImgList() {
        return "imglist";
    }

    @RequestMapping("/imglist1")
    public String jumpToImgList1() {
        return "imglist1";
    }

    @RequestMapping("/imgtable")
    public String jumpToImgTable() {
        return "imgtable";
    }

    @RequestMapping("/index")
    public String jumpToIndex() {
        return "index";
    }

    @RequestMapping("/left")
    public String jumpToLeft() {
        return "left";
    }

    @RequestMapping("/main")
    public String jumpToMain() {
        return "main";
    }

    @RequestMapping("/right")
    public String jumpToRight() {
        return "right";
    }

    @RequestMapping("/tab")
    public String jumpToTab() {
        return "tab";
    }

    @RequestMapping("/tools")
    public String jumpToTools() {
        return "tools";
    }

    @RequestMapping("/top")
    public String jumpToTop() {
        return "top";
    }

}
