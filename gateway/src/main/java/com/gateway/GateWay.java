package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description: gateway
 * @author: Stylesmile
 * @date: 2019/01/03
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class GateWay {
    public static void main(String[] args){
        SpringApplication.run(GateWay.class,args);
    }
}
