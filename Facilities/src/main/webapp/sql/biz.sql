/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : biz

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2015-07-08 18:17:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `v_role`
-- ----------------------------
DROP TABLE IF EXISTS `v_role`;
CREATE TABLE `v_role` (
  `id` varchar(32) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifyDate` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `isSystem` int(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of v_role
-- ----------------------------
INSERT INTO `v_role` VALUES ('11', '0015-06-26 14:33:17', '2015-06-26 14:33:17', 'anhao  app test ', '1', 'anhao ', 'ROLE_SA');
INSERT INTO `v_role` VALUES ('2748969486', '2015-07-08 18:07:37', '2015-07-08 18:07:37', 'Description96209', '1', 'iam insert role 57034', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('5305962597', '2015-07-08 16:44:24', '2015-07-08 16:44:24', 'Description12943', '1', 'iam insert role 60397', 'ROLE_ADMIN');
INSERT INTO `v_role` VALUES ('5670729038', '2015-07-08 17:29:55', '2015-07-08 17:29:55', 'Description74495', '1', 'iam insert role 42244', 'ROLE_ADMIN');
