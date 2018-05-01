package com.trickster.springcloudservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringCloudController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "Hello Spring Cloud (from service)";
    }
}
