package com.chinal.lh.application.controller;

import com.chinal.lh.application.CurrentUser;
import com.chinal.lh.application.account.model.User;
import com.chinal.lh.domain.Repository.AccountRepository;
import com.chinal.lh.domain.Repository.ClienteleRepository;
import com.chinal.lh.domain.data.Account;
import com.chinal.lh.domain.data.Clientele;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuhua on 16-6-29.
 */
@RestController
@RequestMapping("/app/user")
public class UserController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ClienteleRepository clienteleRepository;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public void  register(){
        accountRepository.save(null);
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void Perfect(@CurrentUser User user,@RequestBody Clientele clientele) {
        clienteleRepository.save(null);
    }

}
