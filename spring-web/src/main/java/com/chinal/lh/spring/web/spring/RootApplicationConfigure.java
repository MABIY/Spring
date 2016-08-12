package com.chinal.lh.spring.web.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterRegistration;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhua on 16-7-3.
 */
@Configuration
@ComponentScan(basePackageClasses = {com.chinal.lh.infrastructure.Components.class})
public class RootApplicationConfigure {

//    @Bean
//    public StringHttpMessageConverter stringHttpMessageConverter() {
//        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
//    }



}
