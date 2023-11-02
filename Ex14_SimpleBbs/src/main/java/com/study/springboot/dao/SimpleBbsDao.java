package com.study.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springboot.dto.SimpleBbsDto;

@Repository
public class SimpleBbsDao implements ISimpleBbsDao {

	@Autowired
	JdbcTemplate jt;

	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("listDao()....");
		String query = "SELECT * FROM simple_bbs ORDER BY id DESC";
		List<SimpleBbsDto> dtos = jt.query(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		return dtos;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("viewDao()....");
		String query = "SELECT * FROM simple_bbs WHERE id=" + id;
		SimpleBbsDto dto = jt.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		return dto;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writeDao()....");
		String query = "INSERT INTO simple_bbs (writer, title, content) VALUES (?, ?, ?)";
		return jt.update(query, writer, title, content);
	}

	@Override
	public int deleteDao(String id) {
		System.out.println("deleteDao()....");
		String query = "DELETE FROM simple_bbs WHERE id=?";
		return jt.update(query, Integer.parseInt(id));
	}
}
