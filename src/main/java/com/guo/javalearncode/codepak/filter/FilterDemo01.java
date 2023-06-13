package com.guo.javalearncode.codepak.filter;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


@Component
@Log
public class FilterDemo01 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("here im filter01 now do something");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
