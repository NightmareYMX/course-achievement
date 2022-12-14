package com.school.course_achievement.mapper;

import com.school.course_achievement.pojo.ClassDegree;
import com.school.course_achievement.pojo.ClassDegreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassDegreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int countByExample(ClassDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int deleteByExample(ClassDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insert(ClassDegree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insertSelective(ClassDegree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    List<ClassDegree> selectByExample(ClassDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExampleSelective(@Param("record") ClassDegree record, @Param("example") ClassDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExample(@Param("record") ClassDegree record, @Param("example") ClassDegreeExample example);
}