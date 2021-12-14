package com.ly.prt.redis;

public interface RedisService {
    void setCode(String token);
    void getCode(String token);
}
