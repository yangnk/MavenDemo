package com.yangnk.spring.springJDBCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by yangnk23900 on 2018/12/2.
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		CarJdbcTemplete jdbcTemplate = (CarJdbcTemplete) applicationContext.getBean("jdbcTemplate");
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		//插入数据
//		jdbcTemplate.update("insert into car(id, engine, wheel) values('2','kading','2')");
		//查询数据
		Car car = jdbcTemplate.queryForObject("select id, engine, wheel from car where id='1'", new CarMapper());
		System.out.println(car.toString());
		//存储过程查询数据
		Car car1 = jdbcTemplate.getCar("2", dataSource);
		System.out.println(car1.toString());
	}
}
