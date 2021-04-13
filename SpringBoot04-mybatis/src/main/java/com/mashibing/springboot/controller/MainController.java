package com.mashibing.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mashibing.springboot.mapper.Account;
import com.mashibing.springboot.service.AccountService;

@Controller
public class MainController {
	
	@Autowired
	AccountService accSrv;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Account> list () {
		List<Account> list = accSrv.findAll();
		return list;
	}

	@RequestMapping("/add")
	@ResponseBody
	public Object add () {
		accSrv.add();
		return "OK";
	}

}
