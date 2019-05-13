package com.example.sericefeign.service;

import org.springframework.stereotype.Service;

/**
 * @author zxq
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello() {
        return "error";
    }
}
