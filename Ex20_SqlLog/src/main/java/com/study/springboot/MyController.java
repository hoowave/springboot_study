package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.study.springboot.dao.IMyUserDao;

@Controller
public class MyController {

	@Autowired
	private IMyUserDao userDao;

	@RequestMapping("/")
	public String root() {
		return "main";
	}

	@RequestMapping("/list")
	public String userlistPage(Model model) {
		model.addAttribute("users", userDao.list());

		return "userlist";
	}
}
