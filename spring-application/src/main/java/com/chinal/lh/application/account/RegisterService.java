package com.chinal.lh.application.account;

import com.chinal.lh.application.account.model.SignUp;
import com.chinal.lh.application.account.model.User;
import com.chinal.lh.application.spring.CurrentUser;
import com.chinal.lh.domain.account.AccountService;
import com.chinal.lh.domain.account.model.Account;
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
@RequestMapping("/api/user")
public class RegisterService {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void  register(@RequestBody SignUp signUp){
        accountService.register(signUp.getAccountName(), signUp.getPassword());
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void Perfect(@CurrentUser User user, @RequestBody Clientele clientele) {
        String name = "1";
    }

}
