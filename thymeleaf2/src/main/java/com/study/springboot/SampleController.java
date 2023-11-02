package com.study.springboot;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("")
	public @ResponseBody String root() {
		return "sample....";
	}

	@RequestMapping("/ex01")
	public String ex01(ProductDto product, Model model) {
		model.addAttribute("title", "SampleEx01---");
		model.addAttribute("subTitle", "타임리프 폼데이터 연습");
		model.addAttribute("product", product);
		return "/sample/sampleEx01";
	}

	@PostMapping("/reg")
	public String reg(ProductDto product, Model model) {
		System.out.println(product);
		model.addAttribute("product", product);
		return "/sample/result";
	}

	@GetMapping("/product")
	public String getProduct(Model model) {
		ProductDto product = new ProductDto().builder().pno(10).pname("COMPUTER").price(800000).regdate(LocalDate.now()).build();
		model.addAttribute("product", product);
		return "/sample/productinfo";
	}
}
