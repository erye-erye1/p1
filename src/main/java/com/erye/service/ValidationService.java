package com.erye.service;

import com.erye.entity.Consumer;

public class ValidationService implements ValidationServiceInter {

	public void save(Consumer consumer) {
		System.out.println("验证参数不能为 null = " + consumer);
	}

	public void update(Consumer consumer) {
		System.out.println("分组验证实例 = " + consumer);
	}

}
