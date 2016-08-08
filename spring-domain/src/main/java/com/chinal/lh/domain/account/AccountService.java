package com.chinal.lh.domain.account;

import com.chinal.lh.domain.account.model.Account;
import com.chinal.lh.domain.account.model.AccountState;
import com.chinal.lh.domain.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

/**
 * Created by sj on 16-8-2.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account register(String name, String password) {
        Account account = accountRepository.findByName(name);
        if (account != null) {
            throw new InvalidParameterException("该用户已存在");
        }
        account = new Account().builder().account(name).password(password).state(AccountState.active).build();
        accountRepository.save(account);
        return account;
    }
}
