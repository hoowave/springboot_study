package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping("")
	public @ResponseBody String root() {
		return "JPA 연습...";
	}

	@RequestMapping("/main")
	public String mainPage(Model model) {
		model.addAttribute("data", "Main Page");
		return "main";
	}
}
