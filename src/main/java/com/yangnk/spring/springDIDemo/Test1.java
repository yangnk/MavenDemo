package com.yangnk.spring.springDIDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-09-16 下午4:20
 **/
public class Test1 {
    private HelloWorld p1;

    public void setP1(HelloWorld p1) {
        this.p1 = p1;
    }

    public HelloWorld getP1() {
        return p1;
    }

    private void init() {
        System.out.println("Test1 bean is init...");
    }

    private void destroy() {
        System.out.println("Test1 bean is destroy...");
    }
}
