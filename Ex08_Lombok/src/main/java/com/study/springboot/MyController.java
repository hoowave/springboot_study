package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	// @RequestMapping("/")
	public @ResponseBody String root() {
		return "전달되는 데이터 입니다. 뷰가 아닙니다.";
	}

	// @RequestMapping("/index")
	public void index() {
	}

	@RequestMapping("/form")
	public void form() {
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "result";
	}

	@RequestMapping("/login2")
	public String login2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "result";
	}

	@RequestMapping("/test1/{id}/{pw}")
	public String test1(@PathVariable String id, @PathVariable String pw) {
		return "result";
	}
}
