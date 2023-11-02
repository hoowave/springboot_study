package com.study.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.dao.IMemberDao;
import com.study.springboot.dto.MemberDto;
import com.study.springboot.service.RestApiService;

@CrossOrigin
@RestController
public class RestApiController {

	@Autowired
	RestApiService service;

	@Autowired
	IMemberDao dao;

	@GetMapping("/member/{mno}")
	public ResponseEntity<MemberDto> member(@PathVariable String mno) {
		MemberDto dto = service.member(mno);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}

	@GetMapping("/members")
	public ResponseEntity<List<MemberDto>> members() {
		List<MemberDto> mlist = service.members();
		return ResponseEntity.status(HttpStatus.OK).body(mlist);
	}

	@PostMapping("/member")
	public String postMember(@RequestBody MemberDto member) {
		boolean result = service.postMember(member);
		if (result) {
			return "성공";
		}
		return "실패";
	}

}
