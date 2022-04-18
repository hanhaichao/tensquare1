package com.tensquare.spit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import until.IdWorker;


@SpringBootApplication

@EnableEurekaClient
public class SpitApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpitApplication.class);
    }

    @Bean
    public IdWorker idWorker() {

        return new IdWorker();
    }
}
