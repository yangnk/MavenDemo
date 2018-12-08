package com.yangnk.spring.springTxDemo.DAO;

import com.yangnk.spring.springTxDemo.Bean.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by yangnk23900 on 2018/12/3.
 */
public interface StudentDAO {
	public void setDataSource(DataSource ds);

	public void create(String name, Integer age, Integer marks, Integer year);

	public List<StudentMarks> listStudents();
}
