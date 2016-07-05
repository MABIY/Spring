package com.chinal.lh.spring.web.spring.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

/**
 * Created by liuhua on 16-7-5.
 */
@Setter
@Getter
@AllArgsConstructor
public class GrantedAuthorityImpl implements GrantedAuthority{
    private String Authority;
    @Override
    public String getAuthority() {
        return Authority;
    }
}
