package com.yangnk.spring.springDIDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${入口类}
 *
 * @author yangningkai
 * @create 2018-09-16 下午4:02
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
//        Test1 test1 = (Test1) applicationContext.getBean("test1");
//        System.out.println(helloWorld.getMessage());
//        System.out.println("ah");
//        System.out.println(test1.getP1().toString());
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.spellCheck();
    }
}
