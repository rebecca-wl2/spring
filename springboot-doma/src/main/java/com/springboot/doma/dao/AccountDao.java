package com.springboot.doma.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.doma.entity.Account;


@Dao
@ConfigAutowireable
public interface AccountDao {
	@Select
    List<Account> selectAll();

    @Insert
    @Transactional
    int insert(Account account);
}
