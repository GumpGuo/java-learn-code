package com.guo.javalearncode.codepak.eventdemo.eventdemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class DemoApplicationPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {
        DemoApplicationEvent demoApplicationEvent = new DemoApplicationEvent(this, message);
        applicationEventPublisher.publishEvent(demoApplicationEvent);
    }
}
