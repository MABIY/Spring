package com.chinal.lh.application.controller;

import com.chinal.lh.application.CurrentUser;
import com.chinal.lh.application.account.model.User;
import com.chinal.lh.domain.account.repository.AccountRepository;
import com.chinal.lh.domain.clientele.repository.ClienteleRepository;
import com.chinal.lh.domain.clientele.model.Clientele;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuhua on 16-6-29.
 */
@RestController
@Api("注册与密码重置")
@RequestMapping("/app/user")
public class RegisterService {

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
