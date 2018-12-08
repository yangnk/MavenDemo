package com.yangnk.spring.springAOPDemo.cgLibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before " + methodProxy.getSuperName());
		System.out.println(method.getName());
		Object o1 = methodProxy.invokeSuper(o, objects);
		//Object o2 = method.invoke(o, args); 使用这种方式会发生死循环，因为方法会被拦截
		System.out.println("after " + methodProxy.getSuperName());
		return o1;
	}
	public  Object newProxyInstance(Class<?> c) {
		//设置产生的代理对象的父类。
		enhancer.setSuperclass(c);
		//设置CallBack接口的实例
		enhancer.setCallback(this);
		//使用默认无参数的构造函数创建目标对象
		return enhancer.create();
	}
}
