package com.chinal.lh.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuhua on 16-6-30.
 */
@Controller
public class TestController {

        @RequestMapping(value = "/login/{name}",method = RequestMethod.GET)
        public String login(@PathVariable String name) {
            return "/login.html";
        }
}
