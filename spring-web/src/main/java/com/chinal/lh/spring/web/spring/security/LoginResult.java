package com.chinal.lh.spring.web.spring.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sj on 16-8-9.
 */
@Data
@Builder
public class LoginResult {
    private String message;
    private String taken;
}
