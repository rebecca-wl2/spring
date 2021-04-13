package com.mashibing.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mashibing.springboot.RespStat;
import com.mashibing.springboot.entity.Account;
import com.mashibing.springboot.service.AccountService;

@Controller
public class MainController {
	
	@Autowired
	AccountService accSrv;
	
	@RequestMapping("/list")
	//@ResponseBody
	public String list () {
	//	List<Account> list = accSrv.findAll();
	//  SQL ->  HQL select account0_.id as id1_0_0_, account0_.age as age2_0_0_, account0_.location as location3_0_0_, account0_.login_name as login_na4_0_0_, account0_.nick_name as nick_nam5_0_0_, account0_.password as password6_0_0_ from account account0_ where account0_.id=?
		 //Object  account = accSrv.findxxx();
		//System.out.println("account:" + account);
		return "list";
	}
	
	/**
	 * 区分 get 和post 请求
	 * 
	 * get : 展示页面
	 * post：收集数据
	 * @return
	 */
	@GetMapping("/register")
	public String register (Model map) {
		
		System.out.println("======get=====");
		
		//map.addAttribute("obj", "aa");
		return "register";
	}
	
	@PostMapping("/register")
	public String registerP (HttpServletRequest request,Account account) {
		System.out.println("======post=====");
		String loginName=(String)request.getParameter("loginName");
		System.out.println("loginName:"+loginName);
		RespStat stat =  accSrv.save(account);
		request.setAttribute("stat", stat);
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String login () {
		
		
		return "login";
	}


}
