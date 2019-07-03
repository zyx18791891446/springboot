package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, String> hello(){
		Map<String, String> map =  new HashMap<>();
		map.put("msg", "HelloWorld");
		return map;
		
	}
}
