package com.guo.javalearncode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages= {"com.guo.javalearncode.codeoak.lockdemo.filter"})
public class JavaLearnCodeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JavaLearnCodeApplication.class, args);
    }

}
