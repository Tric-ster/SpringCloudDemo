package com.trickster.springcloudcustomer.controller;

import com.trickster.springcloudcustomer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    public String test(){
        return testService.test();
    }
}
