package com.study.springboot.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.springboot.entity.Memo;

@SpringBootTest
class MemoRepositoryTests {

	@Autowired
	MemoRepository memoRepository;

	// @Test
	void testClass() {
		System.out.println(memoRepository.getClass().getName());
	}

	// @Test
	void testInsert() {
		IntStream.rangeClosed(1, 20).forEach(i -> {
			Memo memo = Memo.builder().memoText("Sample..." + i).build();
			memoRepository.save(memo);
		});
	}

	// @Test
	void testSelect() {
		Long mno = 10L;
		Optional<Memo> result = memoRepository.findById(mno);
		if (result.isPresent()) {
			Memo memo = result.get();
			System.out.println(memo);
		}
	}

	// @Test
	// @Transactional
	void testSelect2() {
		Long mno = 12L;
		Memo memo = memoRepository.getOne(mno);
		System.out.println("==========");
		System.out.println(memo);
		System.out.println("==========");
	}

	// @Test
	// @Transactional
	void testSelect3() {
		List<Memo> memo = memoRepository.findAll();
		System.out.println("==========");
		System.out.println(memo);
		System.out.println("==========");
	}

	// @Test
	void testUpdate() {
		Memo memo = Memo.builder().mno(19L).memoText("Update Test...").build();
		System.out.println(memoRepository.save(memo));
	}

	// @Test
	void testDelete() {
		Long mno = 11L;
		memoRepository.deleteById(mno);
	}

	// @Test
	void testMno() {
		Long mno = 10L;
		Memo memo = memoRepository.findByMno(mno);
		System.out.println(memo);
	}
}
