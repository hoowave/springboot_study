package com.study.mybbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.mybbs.dao.IMybbsDao;
import com.study.mybbs.dto.MybbsDto;

@Controller
public class MyController {

	@Autowired
	IMybbsDao dao;

	@RequestMapping("/")
	public String root() {
		return "main";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.getList());
		return "list";
	}

	@GetMapping("/regForm")
	public void regForm() {
	}

	@RequestMapping("/reg")
	public String reg(MybbsDto dto) {
		dao.regist(dto);
		return "redirect:list";
	}
}
