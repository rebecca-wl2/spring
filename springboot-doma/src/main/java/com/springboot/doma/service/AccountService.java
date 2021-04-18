package com.springboot.doma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.doma.dao.AccountDao;
import com.springboot.doma.entity.Account;

@Service
public class AccountService {
	
	@Autowired
	AccountDao accountDao;
	
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }

}
