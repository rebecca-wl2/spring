package com.mashibing.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mashibing.springboot.mapper.Account;
import com.mashibing.springboot.mapper.Menu;
import com.mashibing.springboot.service.AccountService;
import com.mashibing.springboot.service.MenuService;

@Controller
public class MainController {

	@Autowired
	AccountService accSrv;

	@Autowired
	MenuService menuSrv;

	@RequestMapping("/listmenu")
	@ResponseBody
	public Object list() {
		List<Account> accounts = accSrv.findAll();

		List<Menu> menus = menuSrv.findAllMenus();

		return menus;
	}

	@RequestMapping("/add")
	@ResponseBody
	public Object add() {
		accSrv.add();
		return "OK";
	}

	@RequestMapping("/page")
	@ResponseBody
	public Object page(@RequestParam(required = false) Integer pageNum,
			@RequestParam(required = false) Integer pageSize) {

		List<Menu> menus = menuSrv.findByPage(pageNum, pageSize);
		return menus;
	}

}
