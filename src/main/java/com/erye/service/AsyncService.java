package com.erye.service;

/**
 * 测试  异步调用
 */
public class AsyncService implements AsyncServiceInter {

	public String async(String name) {
		
		System.out.println("测试异步调用，name = " + name);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "hello, " + name;
	}

}
