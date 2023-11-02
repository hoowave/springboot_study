package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.MemberDto;

@Mapper
public interface IMemberDao {
	public List<MemberDto> list();

	public MemberDto getMember(int mno);

	public int insert(@Param("member") MemberDto member);

	public int update(MemberDto member);

	public int delete(int mno);
}
