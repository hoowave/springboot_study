package com.study.springboot.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {
	private long id;
	private String itemNm;
	private Integer price;
	private String itemDetail;
	private LocalDateTime regTime;
	private LocalDateTime updateTime;
}
