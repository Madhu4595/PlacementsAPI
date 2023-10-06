package com.iti.util;

import org.slf4j.LoggerFactory;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter
{
    private final Logger log;
    
    public SimpleCORSFilter() {
        (this.log = LoggerFactory.getLogger((Class)SimpleCORSFilter.class)).info("CustomeCORSFilter init");
    }
    
    public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) 
    		throws IOException, ServletException {
       
        final HttpServletRequest request = (HttpServletRequest)req;
        final HttpServletResponse response = (HttpServletResponse)res;
        
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "authorization, content-type, xsrf-token");
        response.addHeader("Access-Control-Expose-Headers", "xsrf-token");
        
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(200);
        }
        else {
            chain.doFilter((ServletRequest)request, (ServletResponse)response);
        }
    }
    
    public void init(final FilterConfig filterConfig) {
    }
    
    public void destroy() {
    }
}

