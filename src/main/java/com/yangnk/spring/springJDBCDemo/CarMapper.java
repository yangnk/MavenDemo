package com.yangnk.spring.springJDBCDemo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yangnk23900 on 2018/12/2.
 */
public class CarMapper implements RowMapper<Car> {
	@Override
	public Car mapRow(ResultSet resultSet, int i) throws SQLException {
		Car car = new Car();
		car.setEngine(resultSet.getString("engine"));
		car.setWheel(resultSet.getString("wheel"));
		car.setId(resultSet.getString("id"));
		return car;
	}
}
