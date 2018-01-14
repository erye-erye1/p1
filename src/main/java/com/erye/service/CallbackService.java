package com.erye.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试  参数回调，将消费者的方法以参数的形式回传给服务端
 */
public class CallbackService implements CallbackServiceInter {
	
	private final Map<String, CallbackListenerInter> map = new HashMap<String, CallbackListenerInter>();
	
	// 开启个线程每10s钟处理一次回调
	public CallbackService() {
		Thread t = new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						for(Map.Entry<String, CallbackListenerInter> entry : map.entrySet()) {
							try {
								String changed = entry.getValue().changed(getChanged(entry.getKey()));
								System.out.println("callback = " + changed);
								System.out.println("回调完成，删掉记录");
								map.remove(entry.getKey());
							} catch (Exception e) {
								map.remove(entry.getKey());
								e.printStackTrace();
							}
						}
						Thread.sleep(10000);
						System.out.println("守候着有人访问CallbackServlet请求......");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.setDaemon(true);
		t.start();
	}
	
	// 随便写个处理参数的方法
	public String getChanged(String key) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + ", " + key;
	}

	public void addListerner(String key, CallbackListenerInter listener) {
		map.put(key, listener);
	}

}
