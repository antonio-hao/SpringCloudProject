package com.antonio.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration //自定义Ribbon规则
public class MySelfRule {
	@Bean //负载均衡显示声明负载策略替换默认的轮询策略
	public IRule myRule(){
		//return new RandomRule(); //Ribbon默认是轮询，自定义为随机
		return new RandomRule_ZY();//自定义轮询，每台机器5次
	}
}
