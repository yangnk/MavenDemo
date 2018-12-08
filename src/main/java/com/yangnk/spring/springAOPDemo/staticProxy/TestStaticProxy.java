package com.yangnk.spring.springAOPDemo.staticProxy;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class TestStaticProxy {
	public static void main(String[] args) throws InterruptedException {
		CarProxy automobileProxy = new CarProxy(new Automobile());
		CarProxy bicycleProxy = new CarProxy(new Bicycle());
		automobileProxy.run();
		bicycleProxy.run();
	}
}
