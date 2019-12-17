package com.itrum.babytun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.itrum.babytun.dao")
@EnableCaching//开启缓存
public class BabytunApplication {

    public static void main(String[] args) {
        SpringApplication.run(BabytunApplication.class, args);
    }

}
