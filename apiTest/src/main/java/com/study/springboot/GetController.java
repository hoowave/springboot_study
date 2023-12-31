package com.study.springboot;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.dto.MemberDto;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String root() {
		return "Hello World";
	}

	@GetMapping(value = "/name")
	public String getName() {
		return "James";
	}

	@GetMapping(value = "variable1/{variable}")
	public String getVariable(@PathVariable String variable) {
		return variable;
	}

	@GetMapping(value = "variable2/{variable}")
	public String getVariable2(@PathVariable("variable") String var) {
		return var;
	}

	@GetMapping(value = "/request1")
	public String getRequestParam1(String name, String email, String organization) {
		return name + " | " + email + " | " + organization;
	}

	@GetMapping(value = "/request2")
	public String getRequestParam2(@RequestParam Map<String, String> param) {
		StringBuilder sb = new StringBuilder();
		param.entrySet().forEach(map -> {
			sb.append(map.getKey() + " : " + map.getValue() + "\n");
		});

		return sb.toString();
	}

	@GetMapping(value = "/request3")
	public String getRequestParam3(MemberDto member) {
		return member.toString();
	}

}
