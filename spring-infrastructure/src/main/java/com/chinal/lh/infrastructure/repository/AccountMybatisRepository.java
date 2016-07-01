package com.chinal.lh.infrastructure.repository;

import com.chinal.lh.domain.Repository.AccountRepository;
import com.chinal.lh.domain.data.Account;
import com.chinal.lh.infrastructure.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by liuhua on 16-7-1.
 */
@Repository
public class AccountMybatisRepository implements AccountRepository{

    @Autowired
    AccountMapper accountMapper;

    public Account find(Integer integer) {
        return accountMapper.selectByPrimaryKey(integer);
    }

    public void delete(Integer integer) {
            accountMapper.deleteByPrimaryKey(integer);
    }

    public int save(Account account) {
        if (account.getId() != null) {
            return accountMapper.updateByPrimaryKey(account);
        } else {
            return accountMapper.insert(account);
        }

    }
}
