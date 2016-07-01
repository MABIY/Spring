package com.chinal.lh.application.controller;

import com.chinal.lh.domain.Repository.AccountRepository;
import com.chinal.lh.domain.Repository.UserRepository;
import com.chinal.lh.domain.data.Account;
import com.chinal.lh.domain.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuhua on 16-6-29.
 */
@RestController
public class HelloWorld {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public Account greeting(@PathVariable int id) {
        return accountRepository.find(id);
    }
}
