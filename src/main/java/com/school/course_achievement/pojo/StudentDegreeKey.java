package com.school.course_achievement.pojo;

public class StudentDegreeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_degree.s_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    private String sNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_degree.k_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    private String kNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_degree.s_no
     *
     * @return the value of student_degree.s_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    public String getsNo() {
        return sNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_degree.s_no
     *
     * @param sNo the value for student_degree.s_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    public void setsNo(String sNo) {
        this.sNo = sNo == null ? null : sNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_degree.k_no
     *
     * @return the value of student_degree.k_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    public String getkNo() {
        return kNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_degree.k_no
     *
     * @param kNo the value for student_degree.k_no
     *
     * @mbggenerated Tue Oct 25 14:09:53 CST 2022
     */
    public void setkNo(String kNo) {
        this.kNo = kNo == null ? null : kNo.trim();
    }
}