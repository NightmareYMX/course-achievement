package com.school.course_achievement.mapper;

import com.school.course_achievement.pojo.GraduateRequirement;
import com.school.course_achievement.pojo.GraduateRequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduateRequirementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int countByExample(GraduateRequirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int deleteByExample(GraduateRequirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int deleteByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insert(GraduateRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int insertSelective(GraduateRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    List<GraduateRequirement> selectByExample(GraduateRequirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    GraduateRequirement selectByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExampleSelective(@Param("record") GraduateRequirement record, @Param("example") GraduateRequirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByExample(@Param("record") GraduateRequirement record, @Param("example") GraduateRequirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByPrimaryKeySelective(GraduateRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduate_requirement
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    int updateByPrimaryKey(GraduateRequirement record);
}