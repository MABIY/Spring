package com.chinal.lh.spring.web.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class Config {
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
    @Bean
    public ReloadableResourceBundleMessageSource getReloadableResourceBundleMessageSource() {
        ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource= new ReloadableResourceBundleMessageSource();
        reloadableResourceBundleMessageSource.setUseCodeAsDefaultMessage(false);
        return reloadableResourceBundleMessageSource;
    }
}