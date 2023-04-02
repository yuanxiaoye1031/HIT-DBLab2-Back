package com.yy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yy.mapper")
public class Dblab2BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dblab2BackApplication.class, args);
    }

}
