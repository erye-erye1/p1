package com.erye.service;

import java.util.HashMap;
import java.util.Map;

import com.erye.service.LoginServiceInter;
import com.google.gson.Gson;

public class LoginService implements LoginServiceInter {

	public String login(String username, String password) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		if("root".equals(username) && "123456".equals(password)) {
			map.put("flag", true);
			map.put("result", "登录成功");
		}else {
			map.put("flag", false);
			map.put("result", "别鸡巴瞎输入");
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(map);
		
		return json;
	}
}
