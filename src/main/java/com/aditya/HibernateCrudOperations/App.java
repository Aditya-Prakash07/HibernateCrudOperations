package com.aditya.HibernateCrudOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aditya.entities.User;

public class App {
	public static void main(String[] args) {
//		User user3 = new User();
//		user3.setName("Bahubali Hu Mai");
//		user3.setCity("Goa wale beach pe");
//		user3.setGender("male");
//		user3.setEmail("bahubali@bahuBhaiya.com");
//		user3.setPassword("password@bahuBhai");

		Configuration cfg = new Configuration();
		cfg.configure("/com/aditya/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory(); // it will help to generate object of session, it is
																	// heavy weight so we should not create it again and
																	// again
		Session session = sessionFactory.openSession(); // it will provide CRUD operations methods
		Transaction transaction = session.beginTransaction(); // it will provide transactions eiter all or none . Needed
																// for insert update and delete operations not for get
																// opetations

//		 ----------------------Insert Operation----------------------

//		try {
//			session.save(user3);
//			transaction.commit();
//			System.out.println("  User Details Added Successfully...!  ");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("  User Details Not Added Due To Some ERROR  ");
//		}

//		-----------------------Select Operation-----------------------

//		try {
//			User user = session.get(User.class, 4);
//			if (user != null) {
//				System.out.println(user.getId());
//				System.out.println(user.getName());
//				System.out.println(user.getEmail());
//				System.out.println(user.getGender());
//				System.out.println(user.getPassword());
//				System.out.println(user.getCity());
//			}
//			System.out.println("User not found..");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Failed to faitch Data due to some ERROR ");
//		}

//		-----------------------Update Operation--------------------------

//		try {
//			User user = session.get(User.class, 4);
//			user.setName("Samyak Sigh Rajpoot");
//			session.saveOrUpdate(user);
//			transaction.commit();
//			System.out.println("  User Details Updated Successfully...!  ");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("  User Details Not Updated Due To Some ERROR  ");
//		}

//		-----------------------Delete Operation--------------------------

		try {
			User user = new User();

			user.setId(2);
			session.delete(user);
			transaction.commit();
			System.out.println("  User Deleted Successfully...!  ");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("  Cannot Delete User Due To Some ERROR  ");
		}

	}
}
