package com.yangnk.spring.springAOPDemo.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class AutomobileInvocationHandler implements InvocationHandler {
	Car car = null;

	public AutomobileInvocationHandler(Car car) {
		this.car = car;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("begin...");
		Object obj = method.invoke(method, args);
		System.out.println("end...");
		return obj;
	}
}
