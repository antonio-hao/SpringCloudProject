package com.antonio.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.antonio.springcloud"})
@ComponentScan("com.antonio.springcloud")
public class DeptConsumer800_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer800_Feign_App.class, args);

	}


}
