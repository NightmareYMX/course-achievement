package com.school.course_achievement.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
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
     * This method corresponds to the database table course
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
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Oct 29 21:39:18 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
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
     * This class corresponds to the database table course
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

        public Criteria andKNameIsNull() {
            addCriterion("k_name is null");
            return (Criteria) this;
        }

        public Criteria andKNameIsNotNull() {
            addCriterion("k_name is not null");
            return (Criteria) this;
        }

        public Criteria andKNameEqualTo(String value) {
            addCriterion("k_name =", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotEqualTo(String value) {
            addCriterion("k_name <>", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThan(String value) {
            addCriterion("k_name >", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThanOrEqualTo(String value) {
            addCriterion("k_name >=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThan(String value) {
            addCriterion("k_name <", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThanOrEqualTo(String value) {
            addCriterion("k_name <=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLike(String value) {
            addCriterion("k_name like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotLike(String value) {
            addCriterion("k_name not like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameIn(List<String> values) {
            addCriterion("k_name in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotIn(List<String> values) {
            addCriterion("k_name not in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameBetween(String value1, String value2) {
            addCriterion("k_name between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotBetween(String value1, String value2) {
            addCriterion("k_name not between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKTarget1IsNull() {
            addCriterion("k_target_1 is null");
            return (Criteria) this;
        }

        public Criteria andKTarget1IsNotNull() {
            addCriterion("k_target_1 is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget1EqualTo(String value) {
            addCriterion("k_target_1 =", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1NotEqualTo(String value) {
            addCriterion("k_target_1 <>", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1GreaterThan(String value) {
            addCriterion("k_target_1 >", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1GreaterThanOrEqualTo(String value) {
            addCriterion("k_target_1 >=", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1LessThan(String value) {
            addCriterion("k_target_1 <", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1LessThanOrEqualTo(String value) {
            addCriterion("k_target_1 <=", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1Like(String value) {
            addCriterion("k_target_1 like", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1NotLike(String value) {
            addCriterion("k_target_1 not like", value, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1In(List<String> values) {
            addCriterion("k_target_1 in", values, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1NotIn(List<String> values) {
            addCriterion("k_target_1 not in", values, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1Between(String value1, String value2) {
            addCriterion("k_target_1 between", value1, value2, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget1NotBetween(String value1, String value2) {
            addCriterion("k_target_1 not between", value1, value2, "kTarget1");
            return (Criteria) this;
        }

        public Criteria andKTarget2IsNull() {
            addCriterion("k_target_2 is null");
            return (Criteria) this;
        }

        public Criteria andKTarget2IsNotNull() {
            addCriterion("k_target_2 is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget2EqualTo(String value) {
            addCriterion("k_target_2 =", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2NotEqualTo(String value) {
            addCriterion("k_target_2 <>", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2GreaterThan(String value) {
            addCriterion("k_target_2 >", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2GreaterThanOrEqualTo(String value) {
            addCriterion("k_target_2 >=", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2LessThan(String value) {
            addCriterion("k_target_2 <", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2LessThanOrEqualTo(String value) {
            addCriterion("k_target_2 <=", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2Like(String value) {
            addCriterion("k_target_2 like", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2NotLike(String value) {
            addCriterion("k_target_2 not like", value, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2In(List<String> values) {
            addCriterion("k_target_2 in", values, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2NotIn(List<String> values) {
            addCriterion("k_target_2 not in", values, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2Between(String value1, String value2) {
            addCriterion("k_target_2 between", value1, value2, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget2NotBetween(String value1, String value2) {
            addCriterion("k_target_2 not between", value1, value2, "kTarget2");
            return (Criteria) this;
        }

        public Criteria andKTarget3IsNull() {
            addCriterion("k_target_3 is null");
            return (Criteria) this;
        }

        public Criteria andKTarget3IsNotNull() {
            addCriterion("k_target_3 is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget3EqualTo(String value) {
            addCriterion("k_target_3 =", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3NotEqualTo(String value) {
            addCriterion("k_target_3 <>", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3GreaterThan(String value) {
            addCriterion("k_target_3 >", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3GreaterThanOrEqualTo(String value) {
            addCriterion("k_target_3 >=", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3LessThan(String value) {
            addCriterion("k_target_3 <", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3LessThanOrEqualTo(String value) {
            addCriterion("k_target_3 <=", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3Like(String value) {
            addCriterion("k_target_3 like", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3NotLike(String value) {
            addCriterion("k_target_3 not like", value, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3In(List<String> values) {
            addCriterion("k_target_3 in", values, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3NotIn(List<String> values) {
            addCriterion("k_target_3 not in", values, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3Between(String value1, String value2) {
            addCriterion("k_target_3 between", value1, value2, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget3NotBetween(String value1, String value2) {
            addCriterion("k_target_3 not between", value1, value2, "kTarget3");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointIsNull() {
            addCriterion("k_target_1_point is null");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointIsNotNull() {
            addCriterion("k_target_1_point is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointEqualTo(String value) {
            addCriterion("k_target_1_point =", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointNotEqualTo(String value) {
            addCriterion("k_target_1_point <>", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointGreaterThan(String value) {
            addCriterion("k_target_1_point >", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointGreaterThanOrEqualTo(String value) {
            addCriterion("k_target_1_point >=", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointLessThan(String value) {
            addCriterion("k_target_1_point <", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointLessThanOrEqualTo(String value) {
            addCriterion("k_target_1_point <=", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointLike(String value) {
            addCriterion("k_target_1_point like", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointNotLike(String value) {
            addCriterion("k_target_1_point not like", value, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointIn(List<String> values) {
            addCriterion("k_target_1_point in", values, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointNotIn(List<String> values) {
            addCriterion("k_target_1_point not in", values, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointBetween(String value1, String value2) {
            addCriterion("k_target_1_point between", value1, value2, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget1PointNotBetween(String value1, String value2) {
            addCriterion("k_target_1_point not between", value1, value2, "kTarget1Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointIsNull() {
            addCriterion("k_target_2_point is null");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointIsNotNull() {
            addCriterion("k_target_2_point is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointEqualTo(String value) {
            addCriterion("k_target_2_point =", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointNotEqualTo(String value) {
            addCriterion("k_target_2_point <>", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointGreaterThan(String value) {
            addCriterion("k_target_2_point >", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointGreaterThanOrEqualTo(String value) {
            addCriterion("k_target_2_point >=", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointLessThan(String value) {
            addCriterion("k_target_2_point <", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointLessThanOrEqualTo(String value) {
            addCriterion("k_target_2_point <=", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointLike(String value) {
            addCriterion("k_target_2_point like", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointNotLike(String value) {
            addCriterion("k_target_2_point not like", value, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointIn(List<String> values) {
            addCriterion("k_target_2_point in", values, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointNotIn(List<String> values) {
            addCriterion("k_target_2_point not in", values, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointBetween(String value1, String value2) {
            addCriterion("k_target_2_point between", value1, value2, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget2PointNotBetween(String value1, String value2) {
            addCriterion("k_target_2_point not between", value1, value2, "kTarget2Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointIsNull() {
            addCriterion("k_target_3_point is null");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointIsNotNull() {
            addCriterion("k_target_3_point is not null");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointEqualTo(String value) {
            addCriterion("k_target_3_point =", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointNotEqualTo(String value) {
            addCriterion("k_target_3_point <>", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointGreaterThan(String value) {
            addCriterion("k_target_3_point >", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointGreaterThanOrEqualTo(String value) {
            addCriterion("k_target_3_point >=", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointLessThan(String value) {
            addCriterion("k_target_3_point <", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointLessThanOrEqualTo(String value) {
            addCriterion("k_target_3_point <=", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointLike(String value) {
            addCriterion("k_target_3_point like", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointNotLike(String value) {
            addCriterion("k_target_3_point not like", value, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointIn(List<String> values) {
            addCriterion("k_target_3_point in", values, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointNotIn(List<String> values) {
            addCriterion("k_target_3_point not in", values, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointBetween(String value1, String value2) {
            addCriterion("k_target_3_point between", value1, value2, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andKTarget3PointNotBetween(String value1, String value2) {
            addCriterion("k_target_3_point not between", value1, value2, "kTarget3Point");
            return (Criteria) this;
        }

        public Criteria andTNoIsNull() {
            addCriterion("t_no is null");
            return (Criteria) this;
        }

        public Criteria andTNoIsNotNull() {
            addCriterion("t_no is not null");
            return (Criteria) this;
        }

        public Criteria andTNoEqualTo(String value) {
            addCriterion("t_no =", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotEqualTo(String value) {
            addCriterion("t_no <>", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThan(String value) {
            addCriterion("t_no >", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThanOrEqualTo(String value) {
            addCriterion("t_no >=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThan(String value) {
            addCriterion("t_no <", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThanOrEqualTo(String value) {
            addCriterion("t_no <=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLike(String value) {
            addCriterion("t_no like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotLike(String value) {
            addCriterion("t_no not like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoIn(List<String> values) {
            addCriterion("t_no in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotIn(List<String> values) {
            addCriterion("t_no not in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoBetween(String value1, String value2) {
            addCriterion("t_no between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotBetween(String value1, String value2) {
            addCriterion("t_no not between", value1, value2, "tNo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
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
     * This class corresponds to the database table course
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