package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String root() {
		return "index";
	}

	@RequestMapping("/api")
	public String useApi() {
		return "useApi";
	}

	@RequestMapping("/commonApi")
	public String userCommonApi() {
		return "commonApi";
	}
}
