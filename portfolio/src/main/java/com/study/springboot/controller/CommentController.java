package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.dao.ICommentDAO;
import com.study.springboot.dto.CommentDTO;

@Controller
public class CommentController {

	@Autowired
	ICommentDAO dao;

	@RequestMapping("/")
	public String root(Model model) {
		model.addAttribute("commentlist", dao.listdao());
		return "index.html";
	}

	@RequestMapping("/insert")
	public @ResponseBody String insert(CommentDTO dto) {
		dao.insertDao(dto);
		return "success";
	}
}
