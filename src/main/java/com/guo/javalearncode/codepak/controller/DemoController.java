package com.guo.javalearncode.codepak.controller;

import com.guo.javalearncode.codepak.dao.Demo;
import com.guo.javalearncode.codepak.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/get.do")
    public Object test(){
        return "success";
    }

    @GetMapping("/getById.do")
    public Demo findById(@RequestParam("id")Integer id){
        return  demoService.findById(id);
    }



}
