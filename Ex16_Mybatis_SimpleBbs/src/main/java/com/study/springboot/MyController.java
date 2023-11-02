package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.dao.ISimpleBbsDao;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsDao dao;

	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Mybatis를 이용해 데이터 가져오기";
	}

	@RequestMapping("/list")
	public String view(Model model) {
		model.addAttribute("list", dao.listdao());
		return "list";
	}
}
