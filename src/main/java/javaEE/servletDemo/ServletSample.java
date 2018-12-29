package javaEE.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-08 下午11:45
 **/
public class ServletSample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map map = req.getParameterMap();
        System.out.println("============servlet doGet execute success.===============");
        super.doGet(req, resp);
    }
}
