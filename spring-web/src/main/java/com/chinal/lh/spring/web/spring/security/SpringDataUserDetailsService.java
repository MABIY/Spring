package com.chinal.lh.spring.web.spring.security;

import com.chinal.lh.domain.Repository.AccountRepository;
import com.chinal.lh.domain.data.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.*;

import javax.servlet.ServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhua on 16-7-4.
 */
public class SpringDataUserDetailsService implements UserDetailsService {


    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Account account = null;
        //TODO 字符编码过滤 设置   设置security 字符编码
         account = accountRepository.findByName(userName);

        List<GrantedAuthority> grantedAuthority = new ArrayList<>();
        grantedAuthority.add(new GrantedAuthorityImpl(account.getAuthority()));
        return new User(account.getAccount(),account.getPassword(),grantedAuthority);
    }
}
