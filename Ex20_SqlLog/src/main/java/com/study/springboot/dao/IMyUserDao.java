package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.study.springboot.dto.MyUserDTO;

@Mapper
public interface IMyUserDao {
	List<MyUserDTO> list();
}
