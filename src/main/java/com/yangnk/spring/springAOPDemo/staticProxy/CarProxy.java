package com.yangnk.spring.springAOPDemo.staticProxy;

import com.yangnk.spring.springAOPDemo.jdkDynamicProxy.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangnk23900 on 2018/11/28.
 */
public class CarProxy implements Car {
	private final static Logger logger = LoggerFactory.getLogger(CarProxy.class);
	Car myCar = null;

	public CarProxy(Car car) {
		this.myCar = car;
	}

	@Override
	public void run() {
		logger.info("启动...");
		myCar.run();
		logger.info("熄火...");
	}

}
