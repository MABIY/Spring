package com.chinal.lh.application.account;

import com.chinal.lh.application.account.model.CustomUser;
import com.chinal.lh.application.account.model.SignUp;
import com.chinal.lh.application.spring.CurrentUser;
import com.chinal.lh.domain.account.AccountService;
import com.chinal.lh.domain.clientele.ClienteleService;
import com.chinal.lh.domain.clientele.model.Clientele;
import com.chinal.lh.domain.clientele.repository.ClienteleRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhua on 16-6-29.
 */
@RestController
@Api("注册与密码重置")
@RequestMapping("/api/user")
public class RegisterService {

    @Autowired
    AccountService accountService;

    @Autowired
    ClienteleService clienteleService;

    @Autowired
    ClienteleRepository clienteleRepository;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(@RequestBody SignUp signUp) {
        accountService.register(signUp.getAccountName(), signUp.getPassword());
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void Perfect(@CurrentUser CustomUser customUser, @RequestBody Clientele clientele) {
        clientele.setAccountId(customUser.getId());
        clientele.setId(null);
        clienteleRepository.save(clientele);
    }

}
