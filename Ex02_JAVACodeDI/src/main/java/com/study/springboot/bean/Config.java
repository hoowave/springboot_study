package com.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	Member member = new Member();
	
	@Bean
	public Member member1(String name) {
		member.setName("홍길동");
		member.setNickname("도사");
		member.setPrinter(new PrinterA());
		return member;
	}

	@Bean(name = "hello")
	public Member member2() {
		member.setName("전우치");
		member.setNickname("도사");
		member.setPrinter(new PrinterA());
		return member;
	}

	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}

	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}
