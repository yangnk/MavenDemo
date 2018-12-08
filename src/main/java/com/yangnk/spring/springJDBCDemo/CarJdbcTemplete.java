package com.yangnk.spring.springJDBCDemo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by yangnk23900 on 2018/12/2.
 */
public class CarJdbcTemplete extends JdbcTemplate implements CarDAO{

	@Override
	public Car getCar(String id, DataSource dataSource) {
		SqlParameterSource in = new MapSqlParameterSource().
				addValue("in_id", id);
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		Map<String, Object> out = jdbcCall.execute(in);
		Car car = new Car();
		car.setId(id);
		car.setEngine((String) out.get("out_engine"));
		car.setWheel((String) out.get("out_wheel"));
		return car;
	}
}
