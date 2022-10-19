/*
 Navicat Premium Data Transfer

 Source Server         : MySQL57
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : localhost:3306
 Source Schema         : course

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 19/10/2022 21:51:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class_degree
-- ----------------------------
DROP TABLE IF EXISTS `class_degree`;
CREATE TABLE `class_degree`  (
  `k_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_behave_avg` double(10, 2) NULL DEFAULT NULL,
  `d_behave_low` double(10, 2) NULL DEFAULT NULL,
  `d_behave_high` double(10, 2) NULL DEFAULT NULL,
  `d_homework_avg` double(10, 2) NULL DEFAULT NULL,
  `d_homework_low` double(10, 2) NULL DEFAULT NULL,
  `d_homework_high` double(10, 2) NULL DEFAULT NULL,
  `d_test_1_avg` double(10, 2) NULL DEFAULT NULL,
  `d_test_1_low` double(10, 2) NULL DEFAULT NULL,
  `d_test_1_high` double(10, 2) NULL DEFAULT NULL,
  `d_total` double(10, 2) NULL DEFAULT NULL,
  `d_final_avg` double(10, 2) NULL DEFAULT NULL,
  `d_final_low` double(10, 2) NULL DEFAULT NULL,
  `d_final_high` double(10, 2) NULL DEFAULT NULL,
  `d_target_1_avg` double(10, 1) NULL DEFAULT NULL,
  `d_target_2_avg` double(10, 1) NULL DEFAULT NULL,
  `d_target_3_avg` double(10, 1) NULL DEFAULT NULL,
  `d_target_1_o` double(10, 2) NULL DEFAULT NULL COMMENT '目标1绝对值',
  `d_target_2_o` double(10, 2) NULL DEFAULT NULL COMMENT '目标2绝对值',
  `d_target_3_o` double(10, 2) NULL DEFAULT NULL COMMENT '目标3绝对值',
  `d_total_o` double(10, 2) NULL DEFAULT NULL COMMENT '课程目标达成度绝对值',
  `d_target_1_f` double(10, 2) NULL DEFAULT NULL,
  `d_target_2_f` double(10, 2) NULL DEFAULT NULL,
  `d_target_3_f` double(10, 2) NULL DEFAULT NULL,
  `d_total_f` double(10, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class_degree
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `k_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `k_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名',
  `k_target1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程目标1',
  `k_target2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程目标2',
  `k_target3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程目标3',
  `t_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教职工号',
  PRIMARY KEY (`k_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('25001', 'Hadoop大数据平台与生态系统', '掌握Hadoop集群的运行机制和原理，以及MapReduce和HDFS的运行的架构和操作方式。', '能够组建由Linux虚拟机组成的分布式集群，熟练使用Linux基本指令操作Hadoop集群。', '能够通过Java、Hive-SQL语句以及Echarts框架进行数据导入、处理、业务逻辑分析。', '002467');
INSERT INTO `course` VALUES ('25002', 'Pyhon大数据分析', '掌握Python数据分析相关库的基本语法', '能够用Python进行数据读取、处理、分析并得出结论', '能过熟练使用Numpy、Sklearn等库进行数据分析，并将数据可视化', '002471');

-- ----------------------------
-- Table structure for graduate_point
-- ----------------------------
DROP TABLE IF EXISTS `graduate_point`;
CREATE TABLE `graduate_point`  (
  `p_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '毕业要求指标点',
  `r_id` int(11) NOT NULL COMMENT '毕业要求',
  `p_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '毕业要求指标点内容',
  PRIMARY KEY (`p_id`) USING BTREE,
  INDEX `r_id`(`r_id`) USING BTREE,
  CONSTRAINT `r_id` FOREIGN KEY (`r_id`) REFERENCES `graduate_requirement` (`r_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of graduate_point
-- ----------------------------
INSERT INTO `graduate_point` VALUES (1, 1, '1.1能够运用相关科学原理借助文献研究，分析软件工程问题的营销那个因素，获得有效结论。');
INSERT INTO `graduate_point` VALUES (2, 1, '1.2对问题能结合实际，多方面剖析问题的核心。');
INSERT INTO `graduate_point` VALUES (3, 2, '2.1能够针对特定软件工程问题，选择研究路线，设计试验方案，构建试验系统.');
INSERT INTO `graduate_point` VALUES (4, 2, '2.2能够基于科学原理并采用科学方法对复杂软件工程问题进行研究，包括设计实验、分析与解释数据，并通过信息综合的到合理有效的结论。');
INSERT INTO `graduate_point` VALUES (5, 3, '3.1能够对与开发的系统和解决的问题进行综述，并能发表一定质量的论文');

-- ----------------------------
-- Table structure for graduate_requirement
-- ----------------------------
DROP TABLE IF EXISTS `graduate_requirement`;
CREATE TABLE `graduate_requirement`  (
  `r_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '毕业要求序号',
  `r_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '毕业要求',
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of graduate_requirement
-- ----------------------------
INSERT INTO `graduate_requirement` VALUES (1, '问题分析');
INSERT INTO `graduate_requirement` VALUES (2, '研究');
INSERT INTO `graduate_requirement` VALUES (3, '发表论文');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `s_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `s_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `c_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级',
  PRIMARY KEY (`s_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('17273323', 'lwq', '201');
INSERT INTO `student` VALUES ('2012630111', 'zyb', '201');
INSERT INTO `student` VALUES ('2012630125', 'ymx', '201');
INSERT INTO `student` VALUES ('2012630205', 'xjh', '202');
INSERT INTO `student` VALUES ('2012630213', 'ych', '202');
INSERT INTO `student` VALUES ('2012630228', 'wj', '202');

-- ----------------------------
-- Table structure for student_degree
-- ----------------------------
DROP TABLE IF EXISTS `student_degree`;
CREATE TABLE `student_degree`  (
  `s_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生学号',
  `c_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `behave_degree` double(10, 2) NULL DEFAULT NULL COMMENT '课堂表现分',
  `homework_degree` double(10, 2) NULL DEFAULT NULL COMMENT '课后作业分',
  `test_degree` double(10, 2) NULL DEFAULT NULL COMMENT '实验分',
  `final_degree` double(10, 2) NULL DEFAULT NULL COMMENT '期末考试分',
  `target_1_degree` double(10, 2) NULL DEFAULT NULL COMMENT '目标1评价分',
  `target_2_degree` double(10, 2) NULL DEFAULT NULL COMMENT '目标2评价分',
  `target_3_degree` double(10, 2) NULL DEFAULT NULL COMMENT '目标3评价分'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_degree
-- ----------------------------
INSERT INTO `student_degree` VALUES ('17273323', '25001', 17.50, 16.80, 55.65, 95.43, 4.60, 4.50, 4.50);
INSERT INTO `student_degree` VALUES ('17273323', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630111', '25001', 16.87, 18.99, 48.79, 96.52, 4.40, 4.80, 4.50);
INSERT INTO `student_degree` VALUES ('2012630111', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630125', '25001', 14.79, 18.56, 57.89, 89.57, 4.50, 4.50, 4.20);
INSERT INTO `student_degree` VALUES ('2012630205', '25001', 15.60, 18.76, 52.38, 95.47, 4.70, 4.70, 4.70);
INSERT INTO `student_degree` VALUES ('2012630213', '25001', 17.86, 16.75, 53.07, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630228', '25001', 14.83, 19.04, 56.48, 97.84, 4.30, 4.50, 4.70);
INSERT INTO `student_degree` VALUES ('2012630125', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630205', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630213', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `student_degree` VALUES ('2012630228', '25002', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `t_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教职工号',
  `t_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师名字',
  `t_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师登陆密码',
  PRIMARY KEY (`t_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('002461', 'sg', '123');
INSERT INTO `teacher` VALUES ('002462', 'xhp', '123');
INSERT INTO `teacher` VALUES ('002463', 'zm', '123');
INSERT INTO `teacher` VALUES ('002464', 'wcw', '123');
INSERT INTO `teacher` VALUES ('002465', 'cmy', '123');
INSERT INTO `teacher` VALUES ('002466', 'yh', '123');
INSERT INTO `teacher` VALUES ('002467', 'zlc', '123');
INSERT INTO `teacher` VALUES ('002468', 'gah', '123');

-- ----------------------------
-- Table structure for weight
-- ----------------------------
DROP TABLE IF EXISTS `weight`;
CREATE TABLE `weight`  (
  `k_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `behave_target_1_weight` double(10, 2) NOT NULL,
  `behave_target_2_weight` double(10, 2) NOT NULL,
  `behave_target_3_weight` double(10, 2) NOT NULL,
  `homework_target_1_weight` double(10, 2) NOT NULL,
  `homework_target_2_weight` double(10, 2) NOT NULL,
  `homework_target_3_weight` double(10, 2) NOT NULL,
  `test_target_1_weight` double(10, 2) NOT NULL,
  `test_target_2_weight` double(10, 2) NOT NULL,
  `test_target_3_weight` double(10, 2) NOT NULL,
  `final_target_1_weight` double(10, 2) NOT NULL,
  `final_target_2_weight` double(10, 2) NOT NULL,
  `final_target_3_weight` double(10, 2) NOT NULL,
  PRIMARY KEY (`k_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of weight
-- ----------------------------
INSERT INTO `weight` VALUES ('25001', 0.34, 0.33, 0.33, 0.60, 0.00, 0.40, 0.00, 0.50, 0.50, 0.30, 0.40, 0.30);
INSERT INTO `weight` VALUES ('25002', 0.34, 0.33, 0.33, 0.60, 0.00, 0.40, 0.00, 0.50, 0.50, 0.30, 0.40, 0.30);

SET FOREIGN_KEY_CHECKS = 1;
