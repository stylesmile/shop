package com.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 *
 * @author Stylesmile
 * @date 2019/01/04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsoelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsoelApplication.class, args);
    }
}
