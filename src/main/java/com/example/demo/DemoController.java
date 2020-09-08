package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idris/")
public class DemoController {
	
	@RequestMapping("/demo")
	public String getuser() {
		return"hi this is demo project for microservices";
	}

}
