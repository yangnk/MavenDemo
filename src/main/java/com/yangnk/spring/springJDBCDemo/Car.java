package com.yangnk.spring.springJDBCDemo;

/**
 * Created by yangnk23900 on 2018/12/2.
 */
public class Car {
	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	String wheel;
	String engine;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@Override
	public String toString() {
		return "Car{" +
				"wheel='" + wheel + '\'' +
				", engine='" + engine + '\'' +
				", id='" + id + '\'' +
				'}';
	}
}
