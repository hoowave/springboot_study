package com.study.springboot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyUserDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	public List<MyUserDTO> list(){
		String query = "SELECT * FROM myUser";
		List<MyUserDTO> list = jt.query(query, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));
		return list;
	}
}
