package com.chinal.lh.spring.web.spring.security;

import com.chinal.lh.domain.account.repository.AccountRepository;
import com.chinal.lh.domain.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
        Account account = accountRepository.findByName(userName);
        List<GrantedAuthority> grantedAuthority = new ArrayList<>();
        grantedAuthority.add(new GrantedAuthorityImpl(account.getAuthority().toString()));
        return new User(account, grantedAuthority);
    }

}
