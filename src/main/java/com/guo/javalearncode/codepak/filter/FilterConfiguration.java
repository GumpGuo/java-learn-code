package com.guo.javalearncode.codepak.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean =new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterDemo03());
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.setOrder(1);
        return  filterRegistrationBean;
    }

}
