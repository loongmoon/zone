package com.zhao.zone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class ZoneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZoneApplication.class, args);
        log.info("zone启动成功!");
    }
}
