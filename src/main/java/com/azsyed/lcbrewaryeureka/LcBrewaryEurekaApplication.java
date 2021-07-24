package com.azsyed.lcbrewaryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LcBrewaryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcBrewaryEurekaApplication.class, args);
    }

}
