package com.yangnk.spring.springAOPDemo.jdkDynamicProxy;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class TestDynamicProxy {
	public static void main(String[] args) {
		Car car = CarDynamicProxy.create();
		car.run();
	}
}
