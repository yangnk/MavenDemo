/*
Navicat MySQL Data Transfer

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2018-12-02 15:02:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `car`
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `wheel` varchar(255) DEFAULT NULL COMMENT '轮子品牌',
  `engine` varchar(255) DEFAULT NULL COMMENT '发动机品牌',
  `id` varchar(255) NOT NULL DEFAULT '' COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
