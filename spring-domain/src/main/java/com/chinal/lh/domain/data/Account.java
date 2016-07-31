package com.chinal.lh.domain.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Account {
    private Integer id;

    private String account;

    private String password;

    private String state;

    private Date createTime;

    private String authority;
}