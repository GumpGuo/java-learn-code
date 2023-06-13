package com.guo.javalearncode.codepak.eventdemo.eventdemo02;


import lombok.extern.java.Log;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class DemoApplicationListener02 {


    @EventListener
    public void eventListener(DemoApplicationEvent02 demoApplicationEvent02){
        log.info("listener info get" +demoApplicationEvent02.getEventInfo());
    };


}
