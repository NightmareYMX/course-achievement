package com.school.course_achievement.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    int findUser(String username, String password);
}
