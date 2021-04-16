package com.mashibing.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.mashibing.springboot.entity.Account;
import com.mashibing.springboot.mapper.AccountMapper;
import com.mashibing.springboot.mapper.MenuMapper;
import com.mashibing.springboot.service.AccountService;
//import com.mashibing.springboot.service.IAccountService;

/**
 * 用户账户相关
 * 
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountSrv;

	// @Autowired
	// IAccountService is;

	@RequestMapping("login")
	public String login() {
		// System.out.println(ap.selectById(1));;
		// System.out.println(is.count());
		return "account/login";
	}

	@RequestMapping("validataAccount")
	@ResponseBody
	public String validataAccount(String loginName,String password,HttpServletRequest request) {
		
		Account account = accountSrv.findByLoginNameAndPassword(loginName, password);
		
		if (account == null) { 
			return "登录失败"; 
		}else { // 登录成功 // 写到Session里 //
			request.getSession().setAttribute("account", account); 
			return "success"; 
		} 

	}

	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		
		request.getSession().removeAttribute("account");
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		//PageInfo<Account>page = accountSrv.findByPage(pageNum,pageSize);
		//model.addAttribute("page", page);
		List<Account> accountList = accountSrv.findAll();
		model.addAttribute("accountList", accountList);
		return "/account/list";
	}
	
	@RequestMapping("/listByPage")
	public String listByPage(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "2" ) int pageSize,Model model) {
		
		List<Account> accountList  = accountSrv.findByPage(pageNum,pageSize);
		model.addAttribute("accountList", accountList);
		return "/account/list";
	}


}
