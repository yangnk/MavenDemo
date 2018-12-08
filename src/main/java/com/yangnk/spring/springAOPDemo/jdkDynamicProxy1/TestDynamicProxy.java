package com.yangnk.spring.springAOPDemo.jdkDynamicProxy1;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class TestDynamicProxy {
	public static void main(String[] args) {
		AutomobileProxy automobileProxy = new AutomobileProxy(new Automobile());
		Automobile automobile = (Automobile) automobileProxy.create();
		automobile.run();
	}
}
