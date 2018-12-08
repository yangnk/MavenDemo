package com.yangnk.spring.springTxDemo.DAO.impl;

import com.yangnk.spring.springTxDemo.Bean.StudentMarks;
import com.yangnk.spring.springTxDemo.DAO.StudentDAO;
import com.yangnk.spring.springTxDemo.mapper.StudentMarksMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 *
 * @author yangnk23900
 * @date 2018/12/3
 */
public class StudentDAOImpl implements StudentDAO{
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void create(String name, Integer age, Integer marks, Integer year){
		try {
			String SQL1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplateObject.update( SQL1, name, age);
//			String SQL2 = "select max(id) from Student";
////			int sid = jdbcTemplateObject.queryForInt( SQL2 );
//			StudentMarks studentMarks = (StudentMarks) jdbcTemplateObject.query(SQL2, new StudentMarksMapper());
//			int sid = studentMarks.getSid();
			String SQL3 = "insert into Marks(sid, marks, year) " +
					"values (?, ?, ?)";
//			jdbcTemplateObject.update( SQL3, sid, marks, year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			// to simulate the exception.
			throw new RuntimeException("simulate Error condition") ;
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
	}
	@Override
	public List<StudentMarks> listStudents() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks=jdbcTemplateObject.query(SQL,
				new StudentMarksMapper());
		return studentMarks;
	}
}
