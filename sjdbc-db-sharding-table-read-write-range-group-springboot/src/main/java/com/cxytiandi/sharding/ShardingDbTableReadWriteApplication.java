package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * Spring Boot版 Sharding JDBC 分库分表+读写分离案例(范围分表+取模=无限扩容)
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DruidDataSourceAutoConfigure.class })
public class ShardingDbTableReadWriteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableReadWriteApplication.class, args);
    }
}
