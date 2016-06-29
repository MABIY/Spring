package com.chinal.lh.spring.web.spring;

import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by liuhua on 16-6-29.
 */
//Implementations of this SPI will be detected automatically by  SpringServletContainerInitializer (在项目中随意放置)
//实现类 WebAppInitializer 效果等同于web.xml
public class WebAppInitializer implements WebApplicationInitializer {
    public void onStartup(javax.servlet.ServletContext container) throws ServletException {
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");

        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
