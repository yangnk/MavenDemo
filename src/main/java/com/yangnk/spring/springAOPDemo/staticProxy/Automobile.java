package com.yangnk.spring.springAOPDemo.staticProxy;

import com.yangnk.spring.springAOPDemo.jdkDynamicProxy.Car;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class Automobile implements Car {
	@Override
	public void run() {
		System.out.println("automobile is runing...");
	}
}
