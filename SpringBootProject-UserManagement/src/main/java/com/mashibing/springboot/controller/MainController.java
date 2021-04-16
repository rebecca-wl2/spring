package com.mashibing.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	//@ResponseBody
	@RequestMapping("/")
	public String index() {

		return "index";
	}


	@RequestMapping("/index")
	public String index1() {

		return "index";
	}
}
