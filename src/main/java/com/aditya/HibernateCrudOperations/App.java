package com.aditya.HibernateCrudOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aditya.entities.User;

public class App {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("Mai Khud");
		user1.setCity("Hajipur");
		user1.setGender("male");
		user1.setEmail("prakashaditya775@gmail.com");
		user1.setPassword("password@123");

		Configuration cfg = new Configuration();
		cfg.configure("/com/aditya/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // it will help to generate object of session, it is
																	// heavy weight so we should not create it again and
																	// again
		Session session = sessionFactory.openSession(); // it will provide CRUD operations methods
		Transaction transaction = session.beginTransaction(); // it will provide transactions eiter all or none

		try {
			session.save(user1);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		}
	}
}
