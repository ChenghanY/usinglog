package com.james.usinglog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {

    String findHelloById(@Param("id") Integer id);

    void insert(@Param("id") Integer id, @Param("hello") String hello);

    void update(@Param("id") Integer id, @Param("hello") String hello);

    void delete(@Param("id") Integer id);

}