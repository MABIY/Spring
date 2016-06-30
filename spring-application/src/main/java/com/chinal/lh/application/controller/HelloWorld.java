package com.chinal.lh.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhua on 16-6-29.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String greeting() {
        return "Hello World!";
    }
}
