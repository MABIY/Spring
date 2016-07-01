package com.chinal.lh.infrastructure.mapper;

import com.chinal.lh.domain.data.Account;
import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    Account selectByPrimaryKey(Integer id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}