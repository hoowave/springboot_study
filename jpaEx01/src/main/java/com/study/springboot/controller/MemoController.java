package com.study.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.entity.Memo;
import com.study.springboot.repository.MemoRepository;

@Controller
@RequestMapping("/memo")
public class MemoController {

	@Autowired
	MemoRepository memoRepository;

	@RequestMapping("")
	public @ResponseBody String memoRoot() {
		return "JPA Memo 연습...";
	}

	@GetMapping("/list")
	public String list(Model model) {
		List<Memo> memo = memoRepository.findAll();
		model.addAttribute("data", memo);
		return "list";
	}

	@GetMapping("/insert")
	public String insertForm() {
		return "insertForm";
	}

	@PostMapping("/insert")
	public String insert(Memo object, Model model) {
		Memo temp = Memo.builder().memoText(object.getMemoText()).build();
		memoRepository.save(temp);
		return "redirect:list";
	}
}
