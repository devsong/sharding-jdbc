package com.cxytiandi.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * Spring Boot版 Sharding JDBC 分库分表+读写分离案例
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DruidDataSourceAutoConfigure.class })
@MapperScan("com.cxytiandi.sharding.repository")
public class ShardingDbTableReadWriteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableReadWriteApplication.class, args);
    }
}
