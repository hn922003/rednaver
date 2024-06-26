package com.tjoeun.portfolio_01_Naver_Red.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	// index 페이지
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
}
