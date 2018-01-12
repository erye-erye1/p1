package com.erye.inter;

/**
 * 测试  泛化调用。简而言之，消费者没有接口，就不能使用<dubbo:reference>这个配置了，但是也可以调用服务提供者提供的服务
 */
public interface GenericServiceInter {

	public String generic(String name);
}
