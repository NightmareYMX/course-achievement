package com.school.course_achievement.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentDegreeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public StudentDegreeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSNoIsNull() {
            addCriterion("s_no is null");
            return (Criteria) this;
        }

        public Criteria andSNoIsNotNull() {
            addCriterion("s_no is not null");
            return (Criteria) this;
        }

        public Criteria andSNoEqualTo(String value) {
            addCriterion("s_no =", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotEqualTo(String value) {
            addCriterion("s_no <>", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThan(String value) {
            addCriterion("s_no >", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_no >=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThan(String value) {
            addCriterion("s_no <", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThanOrEqualTo(String value) {
            addCriterion("s_no <=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLike(String value) {
            addCriterion("s_no like", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotLike(String value) {
            addCriterion("s_no not like", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoIn(List<String> values) {
            addCriterion("s_no in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotIn(List<String> values) {
            addCriterion("s_no not in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoBetween(String value1, String value2) {
            addCriterion("s_no between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotBetween(String value1, String value2) {
            addCriterion("s_no not between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andKNoIsNull() {
            addCriterion("k_no is null");
            return (Criteria) this;
        }

        public Criteria andKNoIsNotNull() {
            addCriterion("k_no is not null");
            return (Criteria) this;
        }

        public Criteria andKNoEqualTo(String value) {
            addCriterion("k_no =", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotEqualTo(String value) {
            addCriterion("k_no <>", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoGreaterThan(String value) {
            addCriterion("k_no >", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoGreaterThanOrEqualTo(String value) {
            addCriterion("k_no >=", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLessThan(String value) {
            addCriterion("k_no <", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLessThanOrEqualTo(String value) {
            addCriterion("k_no <=", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLike(String value) {
            addCriterion("k_no like", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotLike(String value) {
            addCriterion("k_no not like", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoIn(List<String> values) {
            addCriterion("k_no in", values, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotIn(List<String> values) {
            addCriterion("k_no not in", values, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoBetween(String value1, String value2) {
            addCriterion("k_no between", value1, value2, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotBetween(String value1, String value2) {
            addCriterion("k_no not between", value1, value2, "kNo");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeIsNull() {
            addCriterion("behave_degree is null");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeIsNotNull() {
            addCriterion("behave_degree is not null");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeEqualTo(Double value) {
            addCriterion("behave_degree =", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeNotEqualTo(Double value) {
            addCriterion("behave_degree <>", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeGreaterThan(Double value) {
            addCriterion("behave_degree >", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("behave_degree >=", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeLessThan(Double value) {
            addCriterion("behave_degree <", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeLessThanOrEqualTo(Double value) {
            addCriterion("behave_degree <=", value, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeIn(List<Double> values) {
            addCriterion("behave_degree in", values, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeNotIn(List<Double> values) {
            addCriterion("behave_degree not in", values, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeBetween(Double value1, Double value2) {
            addCriterion("behave_degree between", value1, value2, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andBehaveDegreeNotBetween(Double value1, Double value2) {
            addCriterion("behave_degree not between", value1, value2, "behaveDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeIsNull() {
            addCriterion("homework_degree is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeIsNotNull() {
            addCriterion("homework_degree is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeEqualTo(Double value) {
            addCriterion("homework_degree =", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeNotEqualTo(Double value) {
            addCriterion("homework_degree <>", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeGreaterThan(Double value) {
            addCriterion("homework_degree >", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("homework_degree >=", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeLessThan(Double value) {
            addCriterion("homework_degree <", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeLessThanOrEqualTo(Double value) {
            addCriterion("homework_degree <=", value, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeIn(List<Double> values) {
            addCriterion("homework_degree in", values, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeNotIn(List<Double> values) {
            addCriterion("homework_degree not in", values, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeBetween(Double value1, Double value2) {
            addCriterion("homework_degree between", value1, value2, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andHomeworkDegreeNotBetween(Double value1, Double value2) {
            addCriterion("homework_degree not between", value1, value2, "homeworkDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeIsNull() {
            addCriterion("test_degree is null");
            return (Criteria) this;
        }

        public Criteria andTestDegreeIsNotNull() {
            addCriterion("test_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTestDegreeEqualTo(Double value) {
            addCriterion("test_degree =", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeNotEqualTo(Double value) {
            addCriterion("test_degree <>", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeGreaterThan(Double value) {
            addCriterion("test_degree >", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("test_degree >=", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeLessThan(Double value) {
            addCriterion("test_degree <", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeLessThanOrEqualTo(Double value) {
            addCriterion("test_degree <=", value, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeIn(List<Double> values) {
            addCriterion("test_degree in", values, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeNotIn(List<Double> values) {
            addCriterion("test_degree not in", values, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeBetween(Double value1, Double value2) {
            addCriterion("test_degree between", value1, value2, "testDegree");
            return (Criteria) this;
        }

        public Criteria andTestDegreeNotBetween(Double value1, Double value2) {
            addCriterion("test_degree not between", value1, value2, "testDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeIsNull() {
            addCriterion("final_degree is null");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeIsNotNull() {
            addCriterion("final_degree is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeEqualTo(Double value) {
            addCriterion("final_degree =", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeNotEqualTo(Double value) {
            addCriterion("final_degree <>", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeGreaterThan(Double value) {
            addCriterion("final_degree >", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("final_degree >=", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeLessThan(Double value) {
            addCriterion("final_degree <", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeLessThanOrEqualTo(Double value) {
            addCriterion("final_degree <=", value, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeIn(List<Double> values) {
            addCriterion("final_degree in", values, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeNotIn(List<Double> values) {
            addCriterion("final_degree not in", values, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeBetween(Double value1, Double value2) {
            addCriterion("final_degree between", value1, value2, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andFinalDegreeNotBetween(Double value1, Double value2) {
            addCriterion("final_degree not between", value1, value2, "finalDegree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeIsNull() {
            addCriterion("target_1_degree is null");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeIsNotNull() {
            addCriterion("target_1_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeEqualTo(Double value) {
            addCriterion("target_1_degree =", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeNotEqualTo(Double value) {
            addCriterion("target_1_degree <>", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeGreaterThan(Double value) {
            addCriterion("target_1_degree >", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("target_1_degree >=", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeLessThan(Double value) {
            addCriterion("target_1_degree <", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeLessThanOrEqualTo(Double value) {
            addCriterion("target_1_degree <=", value, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeIn(List<Double> values) {
            addCriterion("target_1_degree in", values, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeNotIn(List<Double> values) {
            addCriterion("target_1_degree not in", values, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeBetween(Double value1, Double value2) {
            addCriterion("target_1_degree between", value1, value2, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget1DegreeNotBetween(Double value1, Double value2) {
            addCriterion("target_1_degree not between", value1, value2, "target1Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeIsNull() {
            addCriterion("target_2_degree is null");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeIsNotNull() {
            addCriterion("target_2_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeEqualTo(Double value) {
            addCriterion("target_2_degree =", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeNotEqualTo(Double value) {
            addCriterion("target_2_degree <>", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeGreaterThan(Double value) {
            addCriterion("target_2_degree >", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("target_2_degree >=", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeLessThan(Double value) {
            addCriterion("target_2_degree <", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeLessThanOrEqualTo(Double value) {
            addCriterion("target_2_degree <=", value, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeIn(List<Double> values) {
            addCriterion("target_2_degree in", values, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeNotIn(List<Double> values) {
            addCriterion("target_2_degree not in", values, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeBetween(Double value1, Double value2) {
            addCriterion("target_2_degree between", value1, value2, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget2DegreeNotBetween(Double value1, Double value2) {
            addCriterion("target_2_degree not between", value1, value2, "target2Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeIsNull() {
            addCriterion("target_3_degree is null");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeIsNotNull() {
            addCriterion("target_3_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeEqualTo(Double value) {
            addCriterion("target_3_degree =", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeNotEqualTo(Double value) {
            addCriterion("target_3_degree <>", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeGreaterThan(Double value) {
            addCriterion("target_3_degree >", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("target_3_degree >=", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeLessThan(Double value) {
            addCriterion("target_3_degree <", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeLessThanOrEqualTo(Double value) {
            addCriterion("target_3_degree <=", value, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeIn(List<Double> values) {
            addCriterion("target_3_degree in", values, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeNotIn(List<Double> values) {
            addCriterion("target_3_degree not in", values, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeBetween(Double value1, Double value2) {
            addCriterion("target_3_degree between", value1, value2, "target3Degree");
            return (Criteria) this;
        }

        public Criteria andTarget3DegreeNotBetween(Double value1, Double value2) {
            addCriterion("target_3_degree not between", value1, value2, "target3Degree");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_degree
     *
     * @mbggenerated do_not_delete_during_merge Sat Oct 29 21:39:18 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_degree
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}