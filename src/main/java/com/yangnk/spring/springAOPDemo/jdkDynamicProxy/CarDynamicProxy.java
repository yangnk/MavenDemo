package com.yangnk.spring.springAOPDemo.jdkDynamicProxy;


import java.lang.reflect.Proxy;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class CarDynamicProxy{
	public static Car create() {
		Car car = null;
		AutomobileInvocationHandler automobileInvocationHandler = new AutomobileInvocationHandler(new Automobile());
		return  (Car) Proxy.newProxyInstance(Automobile.class.getClassLoader(), Automobile.class.getInterfaces(), automobileInvocationHandler);
	}
}
