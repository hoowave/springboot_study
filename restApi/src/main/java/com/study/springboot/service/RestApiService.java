package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.IMemberDao;
import com.study.springboot.dto.MemberDto;

@Service
public class RestApiService {

	@Autowired
	IMemberDao dao;

	public MemberDto member(String mno) {
		System.out.println(dao);
		return dao.getMember(Integer.parseInt(mno));
	}

	public List<MemberDto> members() {
		System.out.println(dao.list());
		return dao.list();
	}

	public boolean postMember(MemberDto member) {
		System.out.println(member);
		dao.insert(member);
		return true;
	}
}
