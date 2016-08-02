package com.chinal.lh.spring.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
