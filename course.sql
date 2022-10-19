/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50067
 Source Host           : localhost:3306
 Source Schema         : course

 Target Server Type    : MySQL
 Target Server Version : 50067
 File Encoding         : 65001

 Date: 19/10/2022 11:11:40
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `uid` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `phone` int(15) NULL DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY USING BTREE (`uid`)
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'lwq', '123', 10086);

SET FOREIGN_KEY_CHECKS = 1;
