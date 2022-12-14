package com.school.course_achievement.mapper;

import com.school.course_achievement.pojo.StudentDegree;
import com.school.course_achievement.pojo.StudentDegreeExample;
import com.school.course_achievement.pojo.StudentDegreeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDegreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int countByExample(StudentDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int deleteByExample(StudentDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int deleteByPrimaryKey(StudentDegreeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insert(StudentDegree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insertSelective(StudentDegree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    List<StudentDegree> selectByExample(StudentDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    StudentDegree selectByPrimaryKey(StudentDegreeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExampleSelective(@Param("record") StudentDegree record, @Param("example") StudentDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExample(@Param("record") StudentDegree record, @Param("example") StudentDegreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByPrimaryKeySelective(StudentDegree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByPrimaryKey(StudentDegree record);
}