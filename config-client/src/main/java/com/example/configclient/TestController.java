package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 */
@RequestMapping("/")
@RestController
public class TestController {
    @Value("${test-key}")
    private String testKey;

    @RequestMapping("/testKey")
    public String testKey() {
        return testKey;
    }
}