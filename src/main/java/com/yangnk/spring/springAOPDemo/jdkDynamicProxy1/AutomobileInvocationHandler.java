package com.yangnk.spring.springAOPDemo.jdkDynamicProxy1;

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
		if ("run".equals(method.getName())) {
			System.out.println("before automobile run");
			method.invoke(car, args);
			System.out.println("after automobile run");
		}
		return null;
	}
}
