package com.guo.javalearncode.codepak.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class DemoController {

    @GetMapping("/get.do")
    public Object test(){
        return "success";
    }

}
