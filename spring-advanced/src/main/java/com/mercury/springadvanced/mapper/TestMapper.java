package com.mercury.springadvanced.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    String baseTest(String param);
}
