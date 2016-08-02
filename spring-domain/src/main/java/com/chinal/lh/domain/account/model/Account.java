package com.chinal.lh.domain.account.model;

import lombok.Data;

import java.util.Date;

@Data
public class Account {
    private Integer id;

    private String account;

    private String password;

    private AccountState state;

    private Date createTime;

    private AccountAuthority authority;


}