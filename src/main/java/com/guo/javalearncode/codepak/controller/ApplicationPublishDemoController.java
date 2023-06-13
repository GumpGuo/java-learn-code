package com.guo.javalearncode.codepak.controller;

import com.guo.javalearncode.codepak.eventdemo.eventdemo01.DemoApplicationPublisher;
import com.guo.javalearncode.codepak.eventdemo.eventdemo02.DemoApplicationPublisher02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventPublish")
public class ApplicationPublishDemoController {

    @Autowired
    private DemoApplicationPublisher demoApplicationPublisher;

    @Autowired
    private DemoApplicationPublisher02 demoApplicationPublisher02;

    @GetMapping("/event.do")
    public String testEventPublish(){
        demoApplicationPublisher.publishEvent("publish evemt info test");
        return "success";
    }


    @GetMapping("/event02.do")
    public String testEventPublish02(){
        demoApplicationPublisher02.publishInfoMessage("test");
        return "success";
    }

}
