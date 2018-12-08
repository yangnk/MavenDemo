package com.yangnk.spring.springJDBCDemo;

import javax.sql.DataSource;

/**
 * Created by yangnk23900 on 2018/12/2.
 */
public interface CarDAO {
	public Car getCar(String id, DataSource dataSource);
}
