package com.study.mybbs.dto;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class MybbsDto {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Timestamp regdate;
}
