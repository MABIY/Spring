package com.chinal.lh.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * Created by liuhua on 16-6-30.
 */
@Validated
@RestController
public class TestController {

        @RequestMapping(value = "/login/1",method = RequestMethod.GET)
        public String login(@RequestParam  @Pattern(regexp = "^[gph]{3}\\d+") String name) {
            return "1";
        }
}
