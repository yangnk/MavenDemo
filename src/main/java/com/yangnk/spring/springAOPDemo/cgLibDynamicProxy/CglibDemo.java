package com.yangnk.spring.springAOPDemo.cgLibDynamicProxy;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class CglibDemo {
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		Do o = (Do)cglibProxy.newProxyInstance(Do.class);
		System.out.println(o.doSomething(5));
	}
}
