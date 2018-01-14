package com.erye.service;

import com.erye.entity.Computer;

/**
 * 测试  本地存根
 */
public class StubService implements StubServiceInter {

	public Computer getComputer(Integer id) {
		
		Computer computer = new Computer();
		computer.setId(id);
		computer.setName("DELL");
		System.out.println("调用了远程的stubService......");
		return computer;
	}

}
