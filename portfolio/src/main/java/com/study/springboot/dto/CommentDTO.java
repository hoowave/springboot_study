package com.study.springboot.dto;

import lombok.Data;

@Data
public class CommentDTO {
	private int cno;
	private String writer;
	private String content;
	private String password;
	private String secret_yn;
	private String del_yn;
	private String regdate;
}
