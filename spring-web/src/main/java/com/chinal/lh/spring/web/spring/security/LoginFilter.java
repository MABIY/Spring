package com.chinal.lh.spring.web.spring.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sj on 16-8-3.
 */
public class LoginFilter extends AbstractAuthenticationProcessingFilter {


    private final ObjectMapper mapper = new ObjectMapper();

    protected LoginFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException("Authentication method not support: +'\'+");
        }
        InputStreamReader reader = new InputStreamReader(request.getInputStream());
        LoginInput input = mapper.readValue(reader, LoginInput.class);
        String userName = input.getUsername();
        String password = input.getPassword();

        if (userName == null)
            userName = "";
        if (password == null)
            password = "";

        userName = userName.trim();

        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(userName, password);
        return this.getAuthenticationManager().authenticate(authRequest);
    }
}
