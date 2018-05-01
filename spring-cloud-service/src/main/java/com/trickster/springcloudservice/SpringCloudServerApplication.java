package com.trickster.springcloudservice;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class, args);
    }
}
