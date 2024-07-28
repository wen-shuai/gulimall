package com.wenshuai.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.wenshuai.gulimall.coupon.dao")
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args){
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
