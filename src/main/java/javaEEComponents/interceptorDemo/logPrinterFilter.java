package javaEEComponents.interceptorDemo;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yangnk23900 on 2018/11/24.
 */
public class logPrinterFilter implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init start...");
	}
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("doFilter start...");
		filterChain.doFilter(servletRequest, servletResponse);
		PrintWriter printWriter = servletResponse.getWriter();
		printWriter.print("filter test...");
		printWriter.flush();
		printWriter.close();
		System.out.println("doFilter end...");
	}
	@Override
	public void destroy() {
		System.out.println("destroy end...");
	}
}
