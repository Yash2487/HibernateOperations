package com.insert;

import org.hibernate.Session;		
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// step1- Create object of Configuration class
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// step2-
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// step3-
		Session session = sessionFactory.openSession();

		// step4-
		Transaction transaction = session.beginTransaction();

		// step5-insert data into database by using setter
		Student student = new Student();
		student.setFirstname("dipti");
		student.setLastName("mate");
		student.setCity("mumbai");
		student.setMobileNumber("7030280224");

		// step6-
		session.save(student);
		
		// step
		transaction.commit();

		// step7- close the session
		session.close();

		System.out.println("Data Inserted Succesfully...");

	}

}
