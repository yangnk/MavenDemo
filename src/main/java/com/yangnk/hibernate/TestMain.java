package com.yangnk.hibernate;

import com.yangnk.hibernate.pojo.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by yangnk23900 on 2018/12/3.
 */
public class TestMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(18);
		student.setId(001);
		student.setName("yangyang");

		addStudent(student);
	}

	static void addStudent(Student student) {
		Session s = null;
		Transaction tx = null;
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			s = configuration.buildSessionFactory().openSession();
			tx = s.beginTransaction();
			s.save(student);
			tx.commit();
		} catch (HibernateException e) {
			/**
			 * 只是回滚是不行的，一定要把异常报告出去
			 * */
			if (tx != null)
				tx.rollback();
			throw e;
		}finally{
			if(s!=null)
				s.close();
		}

	}
}
