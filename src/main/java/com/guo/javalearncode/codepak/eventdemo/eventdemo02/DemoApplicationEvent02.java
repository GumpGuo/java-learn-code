package com.guo.javalearncode.codepak.eventdemo.eventdemo02;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class DemoApplicationEvent02 extends ApplicationEvent {

    private String eventInfo;
    public DemoApplicationEvent02(Object source, String eventInfo) {
        super(source);
        this.eventInfo = eventInfo;
    }

    public DemoApplicationEvent02(Object source, Clock clock, String eventInfo) {
        super(source, clock);
        this.eventInfo = eventInfo;
    }

    public DemoApplicationEvent02(Object source) {
        super(source);
    }

    public String getEventInfo() {
        return eventInfo;
    }
}
