package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	Logger log = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/home")
	public String getMessage(Model model) {
		log.info("enter in home rest");
		model.addAttribute("theDate", new java.util.Date());
		return "hello";
	}
}
