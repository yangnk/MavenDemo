package com.yangnk.spring.springAOPDemo.jdkDynamicProxy1;

import java.lang.reflect.Proxy;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class AutomobileProxy {
	AutomobileInvocationHandler automobileInvocationHandler = null;
	Car car = null;

	public AutomobileProxy(Car car) {
		this.car = car;
		this.automobileInvocationHandler = new AutomobileInvocationHandler(car);
	}

	Car create() {
		Car proxyCar = (Car)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Car.class}, automobileInvocationHandler);
		return proxyCar;
	}
}
