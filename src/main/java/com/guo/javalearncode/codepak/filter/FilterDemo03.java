package com.guo.javalearncode.codepak.filter;

import lombok.extern.java.Log;

import javax.servlet.*;
import java.io.IOException;

@Log
public class FilterDemo03 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("filter demo03");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
