package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.CommentDTO;

@Mapper
public interface ICommentDAO {
	public List<CommentDTO> listdao();

	public int insertDao(@Param("dto") CommentDTO dto);

	public int deleteDao(String id);
}
