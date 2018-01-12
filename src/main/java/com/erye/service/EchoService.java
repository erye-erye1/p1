package com.erye.service;

/**
 * 测试  回声测试
 */
public class EchoService implements EchoServiceInter {

	public Integer isAvaliable(Integer m, Integer n) {
		
		System.out.println("测试 回声测试 ........");
		System.out.println(10/0);
		int result = m / n;
		
		return result;
	}

}
