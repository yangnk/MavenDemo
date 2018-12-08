package com.yangnk.spring.springTxDemo.mapper;

import com.yangnk.spring.springTxDemo.Bean.StudentMarks;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yangnk23900 on 2018/12/3.
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {
	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setYear(rs.getInt("year"));
		return studentMarks;
	}
}
