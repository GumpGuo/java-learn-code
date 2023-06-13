package com.guo.javalearncode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.guo.javalearncode")
@ServletComponentScan(basePackages= {"com.guo.javalearncode.codeoak.lockdemo.filter"})
public class JavaLearnCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearnCodeApplication.class, args);
    }

}
