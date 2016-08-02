package com.chinal.lh.domain.account.repository;

import com.chinal.lh.domain.account.model.Account;
import com.chinal.lh.domain.repository.CrudRepository;

/**
 * Created by liuhua on 16-7-1.
 */
public interface AccountRepository extends CrudRepository<Account,Integer> {

    Account findByName(String userName);
}
