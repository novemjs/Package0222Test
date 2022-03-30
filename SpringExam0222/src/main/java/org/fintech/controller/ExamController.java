package org.fintech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam/*")
public class ExamController {
	
	@GetMapping("/test1")
	public void test1() {}
	
	@GetMapping("/test2")
	public void test2() {}
	
	@GetMapping("/test3")
	public void test3() {}
}
