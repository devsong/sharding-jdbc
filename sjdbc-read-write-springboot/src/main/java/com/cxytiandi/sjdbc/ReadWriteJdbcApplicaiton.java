package com.cxytiandi.sjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * Spring Boot版 Sharding JDBC 读写分离示列
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DruidDataSourceAutoConfigure.class })
public class ReadWriteJdbcApplicaiton {
	public static void main(String[] args) {
		SpringApplication.run(ReadWriteJdbcApplicaiton.class, args);
	}
}
