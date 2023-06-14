package com.guo.javalearncode.codepak.service.impl;

import com.guo.javalearncode.codepak.dao.Demo;
import com.guo.javalearncode.codepak.mapper.DemoMapper;
import com.guo.javalearncode.codepak.service.DemoService;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.executor.SimpleExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Demo findById(Integer id) {
        MapperProxy ma;
        SimpleExecutor simpleExecutor;
        Demo demo = demoMapper.selectById(id);
        return demo;
    }
}
