package com.erye.service;

import com.erye.inter.GenericServiceInter;

/**
 * 测试  泛化调用
 */
public class GenericService implements GenericServiceInter {

	public String generic(String name) {
		
		System.out.println("测试泛化调用， hello ， " + name);
		
		return name;
	}

}
