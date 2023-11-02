package com.study.springboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsDao dao;

	@RequestMapping("/")
	public String root() {
		return "main";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.listDao());
		return "list";
	}

	@RequestMapping("/list2")
	public String list(@RequestParam("writer") String writer, Model model) {
		if (writer.isEmpty())
			writer = null;
		model.addAttribute("list", dao.listDao2(writer));
		return "list2";
	}

	@RequestMapping("/list3")
	public String list(SimpleBbsDto dto, Model model) {
		model.addAttribute("list", dao.listDao3(dto));
		return "list3";
	}

	@RequestMapping("/list4")
	public String list(String id1, String id2, String id3, Model model) {
		List<String> list = new ArrayList<>();
		list.add(id1);
		list.add(id2);
		list.add(id3);
		model.addAttribute("list", dao.listDao4(list));
		return "list4";
	}

	@RequestMapping("/view")
	public String view(@RequestParam("id") String id, Model model) {
		model.addAttribute("dto", dao.viewDao(id));
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
		dao.writeDao(writer, title, content);
		return "redirect:list";
	}

	@RequestMapping("/write2")
	public String write2(HttpServletRequest request) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		Map<String, String> map = new HashMap<>();
		map.put("writer", writer);
		map.put("title", title);
		map.put("content", content);
		int result = dao.writeDao2(map);
		System.out.println("selectKey result : " + map.get("id"));
		System.out.println("resukt : " + result);
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		String id = request.getParameter("id");
		dao.deleteDao(id);
		return "redirect:list";
	}
}
