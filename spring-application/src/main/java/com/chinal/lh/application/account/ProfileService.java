package com.chinal.lh.application.account;

import com.chinal.lh.application.account.model.CustomUser;
import com.chinal.lh.application.spring.CurrentUser;
import com.chinal.lh.domain.clientele.ClienteleService;
import com.chinal.lh.domain.clientele.model.Clientele;
import com.chinal.lh.domain.clientele.repository.ClienteleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sj on 16-8-12.
 */
@RestController
@RequestMapping("/api/user/profile")
public class ProfileService {

    @Autowired
    ClienteleService clienteleService;

    @Autowired
    ClienteleRepository clienteleRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Clientele getProfile(@CurrentUser CustomUser customUser) {
        return clienteleRepository.findByAccountId(customUser.getId());
    }

    
}
