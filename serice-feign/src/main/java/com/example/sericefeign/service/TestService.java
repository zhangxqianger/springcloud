package com.example.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zxq
 */
@FeignClient(value = "client1", fallback = TestServiceImpl.class)
public interface TestService {
    @RequestMapping("/hello")
    String hello();
}
