package com.study.springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {
	@DeleteMapping(value = "/{variable}")
	public String deleteVariable(@PathVariable String variable) {
		return variable;
	}

	@DeleteMapping(value = "/request1")
	public String getRequestParam1(@RequestParam String email) {
		return "email : " + email;	
	}
}
