package com.study.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springboot.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
	public Memo findByMno(Long mno);
}