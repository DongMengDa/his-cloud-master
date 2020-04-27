package com.choice.his.registry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationRegistry02 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRegistry02.class, args);
    }
}