package com.antonio.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {//boot-->spring  applicationContext.xml -- @confogiration配置 ConfigBean = applicationContext.xml
	
	@Bean
	@LoadBalanced //spring cloud Ribbon 是基于Netflix ribbon实现的一套客户端 负载均衡的工具。
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	//负载均衡显示声明负载策略替换默认的轮询策略
	/*@Bean 
	public IRule myRule(){
		return new RandomRule();
	}*/
}
