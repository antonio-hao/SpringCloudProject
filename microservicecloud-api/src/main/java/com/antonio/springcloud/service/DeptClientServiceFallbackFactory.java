package com.antonio.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.antonio.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component //不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				Dept dept = new Dept();
				dept.setDeptno(id);
				dept.setDname("该ID:" + id + "没有对应的信息,Consumer客户端提供 的降级信息，此刻服务Provider1已关闭");
				dept.setDb_source("no this database in MySQL");
				return dept;
			}
			
			@Override
			public Object discovery() {
				return null;
			}
			
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
