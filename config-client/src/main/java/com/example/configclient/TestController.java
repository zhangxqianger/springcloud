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
    @Value("${test-key:test-key}")
    private String testKey;

    @Value("${testKey2}")
    private String testKey2;

    @RequestMapping("/testKey")
    public String testKey() {
        return testKey;
    }

    @RequestMapping("/testKey2")
    public String testKey2() {
        return testKey2;
    }
}