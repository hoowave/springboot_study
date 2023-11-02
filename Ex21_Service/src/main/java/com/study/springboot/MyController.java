package com.study.springboot;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.study.springboot.service.ISimpleBbsService;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsService service;

	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		int totalCnt = service.count();
		System.out.println("totalCnt : " + totalCnt);
		model.addAttribute("totalCnt", totalCnt);
		model.addAttribute("list", service.list());
		return "list";
	}

	@RequestMapping("/view")
	public String view(@RequestParam("id") String id, Model model) {
		model.addAttribute("dto", service.view(id));
		return "view";

	}

	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Map<String, String> map = new HashMap<>();
		map.put("writer", writer);
		map.put("title", title);
		map.put("content", content);
		service.write(map);
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		String id = request.getParameter("id");
		service.delete(id);
		return "redirect:list";
	}

}
