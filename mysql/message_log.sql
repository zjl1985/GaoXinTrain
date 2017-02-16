/*
Navicat MySQL Data Transfer

Source Server         : 本机MySQL
Source Server Version : 100114
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 100114
File Encoding         : 65001

Date: 2017-02-16 14:05:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message_log
-- ----------------------------
DROP TABLE IF EXISTS `message_log`;
CREATE TABLE `message_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `name` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `context` varchar(4000) CHARACTER SET latin1 DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
