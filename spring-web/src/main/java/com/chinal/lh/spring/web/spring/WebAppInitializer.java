package com.chinal.lh.spring.web.spring;

import com.chinal.lh.spring.web.spring.security.SecurityConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by liuhua on 16-6-29.
 */
//Implementations of this SPI will be detected automatically by  SpringServletContainerInitializer (在项目中随意放置)
//实现类 WebAppInitializer 效果等同于web.xml
//@ComponentScan
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //TODO  添加 parent context
//    public void onStartup(javax.servlet.ServletContext container) throws ServletException {
//        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//        appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
//
//        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(appContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");
//    }

//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        XmlWebApplicationContext cxt = new XmlWebApplicationContext();
//        cxt.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
//        return cxt;
//    }



    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

//        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
//        encodingFilter.setInitParameter("encoding", "UTF-8");
//        encodingFilter.setInitParameter("forceEncoding", "true");
//        encodingFilter.addMappingForUrlPatterns(null, true, "/*");

    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootApplicationConfigure.class, SecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    protected FilterRegistration.Dynamic registerServletFilter(ServletContext servletContext, Filter filter) {
//        return super.registerServletFilter(servletContext, filter);
//    }
}
