    package com.chinal.lh.spring.web.spring.security;

import com.chinal.lh.application.account.model.CustomUser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sj on 16-8-9.
 */
@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {
        CustomUser customUser = (CustomUser)authentication.getPrincipal();

        LoginResult result =  new LoginResult("",request.getSession().getId());
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.print(mapper.writeValueAsString(result));
        out.flush();
        out.close();
    }
}

