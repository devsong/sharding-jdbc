package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * Spring Boot版 Sharding JDBC 分库分表案例
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DruidDataSourceAutoConfigure.class })
public class ShardingDbTableApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableApplication.class, args);
    }
}
