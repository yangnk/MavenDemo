package com.yangnk.spring.springMVCDemo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 过滤器 Filter 的工作原理 
 */
public class FilterTest implements Filter{

    public void destroy() {
        System.out.println("----Filter销毁----");
    }

    public void doFilter(ServletRequest request, ServletResponse response,FilterChain filterChain) throws IOException, ServletException {
        // 对 request、response 进行一些预处理  
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("----调用service之前执行一段代码----");
        // 执行目标资源，放行  
        filterChain.doFilter(request, response);
        System.out.println("----调用service之后执行一段代码----");
    }

    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("----Filter初始化----");
    }
}  