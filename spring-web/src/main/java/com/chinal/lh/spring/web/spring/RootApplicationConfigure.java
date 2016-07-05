package com.chinal.lh.spring.web.spring;

import com.chinal.lh.domain.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;

/**
 * Created by liuhua on 16-7-3.
 */
@Configuration
@ComponentScan(basePackageClasses = {com.chinal.lh.infrastructure.Components.class})
public class RootApplicationConfigure {

}
