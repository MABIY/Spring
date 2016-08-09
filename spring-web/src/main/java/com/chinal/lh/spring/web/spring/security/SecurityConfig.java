package com.chinal.lh.spring.web.spring.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liuhua on 16-7-3.
 */
@EnableWebSecurity
@ComponentScan
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

    private class CustomAuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {
        private final ObjectMapper mapper = new ObjectMapper();

        @Override
        public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                            org.springframework.security.core.AuthenticationException exception) throws IOException, ServletException {
            response.setStatus(400);
            response.setCharacterEncoding("UTF-8");

            String message="";

            if(exception instanceof DisabledException) {
                message = "账号已被禁用！";
            } else {
                message = "用户名或密码错误！";
            }
            mapper.writeValue(response.getWriter(),LoginResult.builder().message(message).build());
        }

    }

    protected void configure(HttpSecurity http) throws Exception {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
//        在SecurityContextPersistenceFilter 过滤前添加过滤器
        http.addFilterBefore(filter, SecurityContextPersistenceFilter.class);

        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth").permitAll()
                .antMatchers("/api/**").authenticated()
                .and()
                .logout()
                .and().addFilterBefore(loginFilter(), UsernamePasswordAuthenticationFilter.class);
    }


    @Bean
    protected LoginFilter loginFilter() throws Exception {
        LoginFilter loginFilter = new LoginFilter("/api/auth");
        loginFilter.setAuthenticationManager(this.authenticationManager());
        loginFilter.setAuthenticationFailureHandler(new CustomAuthenticationFailHandler());
        loginFilter.setAuthenticationSuccessHandler(new CustomAuthenticationSuccessHandler());
        return loginFilter;
    }

    @Bean
    public SpringDataUserDetailsService springDataUserDetailsService() {
        return new SpringDataUserDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
