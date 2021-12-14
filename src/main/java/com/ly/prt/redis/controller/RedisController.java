package com.ly.prt.redis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @GetMapping("/getCode1")
    public String getCode1(){
        return "hello world1";
    }
    @GetMapping("/getCode2")
    public String getCode2(){
        return "hello world2";
    }
}
