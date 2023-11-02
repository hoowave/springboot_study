package com.study.springboot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dto.ItemDto;

@Controller
@RequestMapping("/thymeleaf")
public class MyController {

	@RequestMapping("/ex01")
	public String root(Model model) {
		model.addAttribute("data", "타임리프 연습...");
		return "thymeleafEx/thymeleafEx01";
	}

	@RequestMapping("/ex02")
	public String thymeleafExample02(Model model) {
		ItemDto itemDto = ItemDto.builder().itemDetail("상품 상세 설명").itemNm("테스트상품1").price(10000)
				.regTime(LocalDateTime.now()).build();
		System.out.println("itemDto : " + itemDto);
		model.addAttribute("itemDto", itemDto);
		return "thymeleafEx/thymeleafEx02";
	}

	@RequestMapping("/ex03")
	public String thymeleafExample03(Model model) {
		List<ItemDto> itemDtoList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ItemDto itemDto = ItemDto.builder().itemDetail("상품 상세 설명" + i).itemNm("테스트상품" + i).price(10000 * i)
					.regTime(LocalDateTime.now()).build();
			itemDtoList.add(itemDto);
		}
		model.addAttribute("itemDtoList", itemDtoList);
		return "thymeleafEx/thymeleafEx03";
	}

	@RequestMapping("/ex04")
	public String thymeleafExample04(Model model) {
		List<ItemDto> itemDtoList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ItemDto itemDto = ItemDto.builder().itemDetail("상품 상세 설명" + i).itemNm("테스트상품" + i).price(10000 * i)
					.regTime(LocalDateTime.now()).build();
			itemDtoList.add(itemDto);
		}
		model.addAttribute("itemDtoList", itemDtoList);
		return "thymeleafEx/thymeleafEx04";
	}

	@RequestMapping("/ex05")
	public String thymeleafExample05(Model model) {
		List<ItemDto> itemDtoList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ItemDto itemDto = ItemDto.builder().itemDetail("상품 상세 설명" + i).itemNm("테스트상품" + i).price(10000 * i)
					.regTime(LocalDateTime.now()).build();
			itemDtoList.add(itemDto);
		}
		model.addAttribute("itemDtoList", itemDtoList);
		return "thymeleafEx/thymeleafEx05";
	}

	@RequestMapping("/ex06")
	public String thymeleafExample06() {
		return "thymeleafEx/thymeleafEx06";
	}

	@RequestMapping("/ex07")
	public String thymeleafExample07() {
		return "thymeleafEx/thymeleafEx07";
	}

	@RequestMapping("/ex07-result")
	public String thymeleafExample07(String param1, String param2, Model model) {
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		return "thymeleafEx/thymeleafEx07_result";
	}
}
