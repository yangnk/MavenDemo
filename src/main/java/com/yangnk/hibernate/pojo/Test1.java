package com.yangnk.hibernate.pojo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by yangnk23900 on 2018/12/3.
 */
public class Test1 {
	public static void main(String[] args) {
		//创建session，注意事务
		Configuration configuration = null;
		Session session = null;
		Transaction transaction = null;
		try {
			configuration = new Configuration().configure("hibernate.cfg.xml");
			session = configuration.buildSessionFactory().openSession();
			SpringMvcUser springMvcUser = new SpringMvcUser();
			springMvcUser.setFirstName("yang");
			springMvcUser.setLastName("ningkai");
			springMvcUser.setId(1);
			springMvcUser.setPassword("666666");
			transaction.begin();
			session.save(springMvcUser);
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			transaction.commit();
		}
	}
}
