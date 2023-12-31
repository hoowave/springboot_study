package com.study.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_memo")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Memo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mno;

	@Column(length = 200, nullable = false)
	private String memoText;
}
