package com.demo.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Address;
import com.demo.hibernate.Employee;

public class HibernateApp3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Employee e1 = session.get(Employee.class, 110);
			
			e1.getChildren().add("Raman");
			e1.getChildren().add("Pinki");
			e1.getChildren().add("Rahul");
			
			session.persist(e1);
			session.flush();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {

			session.close();
			sf.close();
		}

	}

}
