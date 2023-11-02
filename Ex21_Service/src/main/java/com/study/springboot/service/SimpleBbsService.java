package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Service
public class SimpleBbsService implements ISimpleBbsService {

	@Autowired
	ISimpleBbsDao dao;

	@Override
	public List<SimpleBbsDto> list() {
		return dao.listDao();
	}

	@Override
	public SimpleBbsDto view(String id) {
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		int result = dao.writeDao(map);
		return result;
	}

	@Override
	public int delete(String id) {
		int result = dao.deleteDao(id);
		return result;
	}

	@Override
	public int count() {
		int totalCnt = dao.countDao();
		return totalCnt;
	}

}
