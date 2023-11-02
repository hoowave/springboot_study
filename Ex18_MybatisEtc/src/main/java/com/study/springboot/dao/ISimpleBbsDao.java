package com.study.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();

	public SimpleBbsDto viewDao(String id);

	public int writeDao(String writer, String title, String content);

	public int writeDao2(Map<String, String> map);

	public int deleteDao(String id);

	public List<SimpleBbsDto> listDao2(@Param("writer") String str);

	public List<SimpleBbsDto> listDao3(@Param("dto") SimpleBbsDto dto);

	public List<SimpleBbsDto> listDao4(@Param("list") List<String> list);
}
