package com.example.serviceribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zxq
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "error")
    public String hello() {
        return "this is ribbon service: " + restTemplate.getForObject("http://CLIENT1/hello", String.class);
    }

    public String error() {
        return "error";
    }
}
