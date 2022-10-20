package com.school.course_achievement.service.Impl;
import com.school.course_achievement.pojo.Teacher;
import org.junit.Test;

import java.util.ArrayList;


public class TeacherServiceImplTest {

    @Test
    public void teacherLogin() {
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        Teacher teacher = new Teacher("1", "name", "123");
        teacherArrayList.add(teacher);
        System.out.println(teacherArrayList.isEmpty());
    }
}