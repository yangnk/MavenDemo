package com.yangnk.spring.springAOPDemo.AOPDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-25 下午8:41
 **/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AOPBeans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
