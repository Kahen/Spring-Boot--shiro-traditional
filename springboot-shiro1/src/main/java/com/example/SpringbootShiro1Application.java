package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kahen
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.mapper")
public class SpringbootShiro1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiro1Application.class, args);
    }

}
