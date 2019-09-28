package com.mercury.springadvanced.controller;

import com.mercury.springadvanced.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {
    @Resource
    TestService testService;
    @GetMapping("baseTest")
    public String baseTest(@RequestParam(value = "param" ) String param){
        int i =1;
        return testService.baseTest(i+"iiiiii");
    }
}
