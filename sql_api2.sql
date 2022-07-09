/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : sql_api2

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 09/07/2022 14:55:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo2
-- ----------------------------
DROP TABLE IF EXISTS `userinfo2`;
CREATE TABLE `userinfo2`  (
  `uid` int(0) NOT NULL AUTO_INCREMENT COMMENT 'uid',
  `nickname` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `uimg` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '/pic/userdefaultimg.jpg' COMMENT '用户头像',
  `uemail` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'email',
  `ulink` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'link',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo2
-- ----------------------------
INSERT INTO `userinfo2` VALUES (1, 'shAdow-XJY', 'https://github.com/shAdow-XJY/vue_router_train/blob/master/docs/img/1.b53b0ea8.png', 'shadowplusing@outlook.com', 'https://github.com/shAdow-XJY');
INSERT INTO `userinfo2` VALUES (2, 'shAdowPlusing', 'https://github.com/shAdow-XJY/vue_router_train/blob/master/docs/img/7.8daf3dee.png', 'shadowplusing@qq.com', 'https://gitee.com/shAdowPlusing');
INSERT INTO `userinfo2` VALUES (3, 'ShadowPlusing', 'https://github.com/shAdow-XJY/vue_router_train/blob/master/docs/img/3.0ccbe469.png', 'shadowplusing@gmail.com', 'https://www.youtube.com/channel/UCv6Qy8q42gH0aKvVRcQvRdQ');
INSERT INTO `userinfo2` VALUES (4, 'Schatten-Ying', 'https://github.com/shAdow-XJY/vue_router_train/blob/master/docs/img/9.30f26156.png', '201930383199@mail.scut.edu.cn', 'https://space.bilibili.com/437699902');

SET FOREIGN_KEY_CHECKS = 1;
