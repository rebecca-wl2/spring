package com.springboot.doma.entity;

import lombok.Data;
import lombok.Value;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
@Data
public class Account {
	@Id
	private Integer id;

    @Column(name = "login_name")
    private String loginName;

    private String password;

    private String nickName;

    private Integer age;

    private String location;

    private String role;

}
