package com.guo.javalearncode.codepak.eventdemo.eventdemo01;

import lombok.extern.java.Log;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Log
public class DemoApplicationListener implements ApplicationListener<DemoApplicationEvent> {

    @Override
    public void onApplicationEvent(DemoApplicationEvent event) {
        log.info(event.getMessage());
    }
}
