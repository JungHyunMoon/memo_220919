package com.memo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memo.post.dao.PostDAO;

@Controller
public class testController {
	
	@Autowired
	private PostDAO postDAO;
	
	@ResponseBody
	@GetMapping("/test1")
	public String test1() {
		return "Hello World!!";
	}
	
	@ResponseBody
	@GetMapping("/test2")
	public Map<String, Object> test2() {
		Map<String, Object> result = new HashMap<>();
		result.put("k1", 1);
		result.put("k2", 2);
		result.put("k3", 3);
		return result;
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "/test";
	}
	
	@ResponseBody
	@GetMapping("/test4")
	public List<Map<String, Object>> test4() {
		return postDAO.selectPostListTest();
	}
}
