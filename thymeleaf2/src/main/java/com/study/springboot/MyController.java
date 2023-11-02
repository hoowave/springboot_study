package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping("")
	public @ResponseBody String root() {
		return "thymeleaf2....";
	}

	@RequestMapping("/ex01")
	public void ex01Method() {
		// return "ex01";
	}

	@RequestMapping("/sample/sampleEx01")
	public void sampleEx01() {
	}
}
