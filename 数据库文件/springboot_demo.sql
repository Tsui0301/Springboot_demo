/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : springboot_demo

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 03/04/2022 23:00:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
                           `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                           `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '标题',
                           `profile` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '内容',
                           `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '作者',
                           `time` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
                           `logoimg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT 'logo',
                           `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '职位',
                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (46, '陈伟霆', '888', '管理员', '2022-04-01 11:41:10', '哈哈熬熬', '会长');
INSERT INTO `member` VALUES (47, '易烊千玺', '888', '管理员', '2022-04-01 11:42:27', '哈哈熬熬', '副会长');
INSERT INTO `member` VALUES (48, '王一博', '888', '管理员', '2022-04-01 11:43:28', '哈哈熬熬', '理事');
INSERT INTO `member` VALUES (49, '杨幂', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');
INSERT INTO `member` VALUES (50, '肖战', '888', '管理员', '2022-04-01 11:46:00', '哈哈熬熬', '理事');
INSERT INTO `member` VALUES (51, '秘密', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');
INSERT INTO `member` VALUES (52, '那英', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');
INSERT INTO `member` VALUES (53, '汉喊', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');
INSERT INTO `member` VALUES (54, '建筑', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');
INSERT INTO `member` VALUES (55, '控制', '888', '管理员', '2022-04-01 11:44:08', '哈哈熬熬', '会员');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `id` int(11) NOT NULL,
                         `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `profile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'tom', '大家好， 我是汤姆，很高兴见到大家！', '13899656615');
INSERT INTO `user` VALUES (2, 'jack', '很高兴认识你！', '13239895964');

SET FOREIGN_KEY_CHECKS = 1;
