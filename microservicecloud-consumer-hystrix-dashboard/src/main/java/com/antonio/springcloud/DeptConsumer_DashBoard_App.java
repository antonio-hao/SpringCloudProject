package com.antonio.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;




@SpringBootApplication
@EnableHystrixDashboard //开启hystrix仪表盘的监控注解
public class DeptConsumer_DashBoard_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);

	}


}
