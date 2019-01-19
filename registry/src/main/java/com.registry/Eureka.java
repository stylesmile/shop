package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:  registry
 * @author:        Stylesmile
 * @date:          2019/01/03
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {
    public static void main(String[] args){
        SpringApplication.run(Eureka.class,args);
    }
}
