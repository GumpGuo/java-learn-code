package com.guo.javalearncode.codepak.eventdemo.eventdemo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationPublisher02 {


    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishInfoMessage(String message){
        DemoApplicationEvent02 demoApplicationEvent02 = new DemoApplicationEvent02(this, message);
        applicationEventPublisher.publishEvent(demoApplicationEvent02);

    }


}
