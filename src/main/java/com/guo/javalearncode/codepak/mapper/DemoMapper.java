package com.guo.javalearncode.codepak.mapper;


import com.guo.javalearncode.codepak.dao.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {

    @Select("select * from demo where id = #{id}")
    Demo selectById(Integer id);

}
