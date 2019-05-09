package com.example.sericefeign.controller;

import com.example.sericefeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        return "this is feign service: " + testService.hello();
    }
}
