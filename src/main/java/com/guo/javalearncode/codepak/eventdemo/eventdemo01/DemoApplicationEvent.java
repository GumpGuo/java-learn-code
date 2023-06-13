package com.guo.javalearncode.codepak.eventdemo.eventdemo01;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;


public class DemoApplicationEvent extends ApplicationEvent {

    private String message ;

    public String getMessage() {
        return message;
    }

    public DemoApplicationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public DemoApplicationEvent(Object source, Clock clock, String message) {
        super(source, clock);
        this.message = message;
    }

    public DemoApplicationEvent(Object source) {
        super(source);
    }
}
