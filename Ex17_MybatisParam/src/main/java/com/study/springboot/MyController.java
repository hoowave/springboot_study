package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.dao.ISimpleBbsDao;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsDao dao;

	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("list", dao.listDao());
		return "list";
	}

	@RequestMapping("view")
	public String view(@RequestParam("id") String id, Model model) {
		model.addAttribute("dto", dao.viewDao(id));
		return "view";

	}

	@RequestMapping("writeForm")
	public String writeForm() {
		return "writeForm";
	}

	@RequestMapping("write")
	public String write(HttpServletRequest request) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		dao.writeDao(writer, title, content);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		String id = request.getParameter("id");
		dao.deleteDao(id);
		return "redirect:list";
	}

}
