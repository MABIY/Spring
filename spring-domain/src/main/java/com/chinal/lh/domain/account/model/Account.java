package com.chinal.lh.domain.account.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Integer id;

    private String account;

    private String password;

    private AccountState state;

    private Date createTime;

    private AccountAuthority authority;

     void passwordEncrypt(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password =passwordEncoder.encode(password);
    }


}