package com.springboot.doma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.doma.entity.Account;
import com.springboot.doma.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

    @RequestMapping(path = "/selectAll")
    List<Account> all() {
        List<Account> list = accountService.selectAll();
        return list;
    }
}
