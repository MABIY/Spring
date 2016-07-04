package com.chinal.lh.spring.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuhua on 16-7-3.
 */
@Configuration
@ComponentScan(basePackageClasses = {com.chinal.lh.infrastructure.Components.class})
public class RootApplicationConfigure {
}
