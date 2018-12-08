package javaEEComponents.listenerDemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-08 下午11:17
 **/
public class ListenerSample implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("===============listener destroyed success.================");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
            System.out.println("===============listener init success.================");
    }
}
