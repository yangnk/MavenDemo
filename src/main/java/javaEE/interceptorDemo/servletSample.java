package javaEE.interceptorDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yangnk23900 on 2018/11/24.
 */
public class servletSample extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置相应类型
		resp.setContentType("text/html");
		//输出到响应体
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("hello world");
		printWriter.flush();
		printWriter.close();
	}
}
