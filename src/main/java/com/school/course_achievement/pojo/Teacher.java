package com.school.course_achievement.pojo;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_no
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    private String tNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    private String tName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_password
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    private String tPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_no
     *
     * @return the value of teacher.t_no
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public String gettNo() {
        return tNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_no
     *
     * @param tNo the value for teacher.t_no
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public void settNo(String tNo) {
        this.tNo = tNo == null ? null : tNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_password
     *
     * @return the value of teacher.t_password
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public String gettPassword() {
        return tPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_password
     *
     * @param tPassword the value for teacher.t_password
     *
     * @mbggenerated Thu Oct 20 10:15:55 CST 2022
     */
    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }
}