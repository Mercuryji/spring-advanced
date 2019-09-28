package com.mercury.springadvanced.service.impl;

import com.mercury.springadvanced.mapper.TestMapper;
import com.mercury.springadvanced.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public String baseTest(String param){
        int i =2;
        return testMapper.baseTest(param);
    }
}
