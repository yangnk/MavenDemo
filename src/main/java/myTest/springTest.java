//package com.yangnk.myTest;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import java.util.Properties;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2018-12-08 下午8:43
// **/
//public class springTest extends HttpServlet{
//    private
//
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        //1.加载配置文件
//        doLoadConfig(config.getInitParameter("test"));
//        //2.扫描所有类
//        doScanner();
//        //3.初始化类容器，保存到IoC容器中
//        doInstance();
//        //4.完成注册依赖，DI操作
//        doAutowired();
//        //5.初始化HandlerMapper
//        initHandlerMapper();
//
//        System.out.println("mySpring is init.");
//
//
//
//        super.init(config);
//    }
//
//    private void initHandlerMapper() {
//    }
//
//    private void doAutowired() {
//    }
//
//    private void doInstance() {
//    }
//
//    private void doScanner() {
//    }
//
//    private void doLoadConfig(String test) {
//        this.getClass().getClassLoader().getResource("")
//
//    }
//}
