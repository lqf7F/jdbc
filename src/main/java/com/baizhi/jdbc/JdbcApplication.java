package com.baizhi.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
        System.out.println("jdbc");
        System.out.println("jdbc123"); 
        System.out.println("jdbc123456"); 
        System.out.println("jdbc123456789"); 
    }

}
