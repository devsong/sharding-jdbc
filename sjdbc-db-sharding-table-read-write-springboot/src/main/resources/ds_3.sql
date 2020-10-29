# ************************************************************
# Sequel Pro SQL dump
# Version 5425
#
# https://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localdb.mysql.com (MySQL 5.7.26-log)
# Database: ds_3
# Generation Time: 2020-10-29 11:22:07 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_order_base
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_order_base`;

CREATE TABLE `t_order_base` (
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单号',
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `user_name` varchar(64) NOT NULL DEFAULT '' COMMENT '用户姓名',
  `mobile` varchar(32) NOT NULL DEFAULT '' COMMENT '手机号',
  `order_status` int(11) NOT NULL COMMENT '订单状态',
  `region_code` varchar(32) NOT NULL DEFAULT '' COMMENT '下单区域',
  `lat` varchar(16) NOT NULL DEFAULT '' COMMENT '纬度',
  `lng` varchar(16) NOT NULL DEFAULT '' COMMENT '经度',
  `create_time` datetime NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间戳',
  PRIMARY KEY (`order_id`),
  KEY `idx_create_time` (`create_time`),
  KEY `idx_timestamp` (`_timestamp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单主表';



# Dump of table t_order_item
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_order_item`;

CREATE TABLE `t_order_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) NOT NULL COMMENT '订单ID',
  `product_id` varchar(32) NOT NULL DEFAULT '' COMMENT '产品ID',
  `product_name` varchar(128) NOT NULL DEFAULT '' COMMENT '产品名',
  `product_num` int(11) NOT NULL DEFAULT '1' COMMENT '产品数量',
  `product_price` int(11) NOT NULL DEFAULT '0' COMMENT '以分为单位',
  `create_time` datetime NOT NULL DEFAULT '2020-01-01 00:00:00' COMMENT '创建时间',
  `_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单产品明细';



# Dump of table t_region_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_region_config`;

CREATE TABLE `t_region_config` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `region_code` varchar(32) NOT NULL DEFAULT '' COMMENT '区域code码',
  `region_name` varchar(128) NOT NULL DEFAULT '' COMMENT '区域名',
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '区域级别',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态',
  `parent_region_code` varchar(32) NOT NULL DEFAULT '' COMMENT '父区域Code码',
  `create_time` datetime NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='区域配置';



# Dump of table t_sys_config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_sys_config`;

CREATE TABLE `t_sys_config` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `sys_key` varchar(128) NOT NULL DEFAULT '' COMMENT '配置键',
  `sys_val` varchar(256) NOT NULL DEFAULT '' COMMENT '配置值',
  `status` int(11) NOT NULL COMMENT '状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `idx_sys_key` (`sys_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统配置';



# Dump of table t_user_order_mapping
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_user_order_mapping`;

CREATE TABLE `t_user_order_mapping` (
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单号',
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `create_time` datetime NOT NULL DEFAULT '2020-01-01 00:00:00' COMMENT '创建时间',
  `_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间戳',
  PRIMARY KEY (`order_id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户-订单映射';




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
