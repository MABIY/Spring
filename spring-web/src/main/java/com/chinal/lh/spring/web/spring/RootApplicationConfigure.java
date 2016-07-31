package com.chinal.lh.spring.web.spring;

import com.chinal.lh.domain.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.filter.CharacterEncodingFilter;

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

//    @Bean
//    public FilterRegistrationBean encodingFilter() {
//        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("UTF-8", true);
//        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
//        filterRegBean.setUrlPatterns(getRootPathUrls());
//        filterRegBean.setFilter(encodingFilter);
//        filterRegBean.setOrder(1);
//        return filterRegBean;
//    }
//
//    private List<String> getRootPathUrls() {
//        List<String> urlPatterns = new ArrayList<String>();
//        urlPatterns.add("/*");
//        return urlPatterns;
//    }

}
