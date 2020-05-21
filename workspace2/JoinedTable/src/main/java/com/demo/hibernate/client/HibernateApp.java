package com.demo.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Employee;
import com.demo.hibernate.Person;
import com.demo.hibernate.TraineeEmp;

public class HibernateApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Person p = new Person();
			p.setName("Kiran");

			Employee e = new Employee();
			e.setName("Raja");
			e.setSalary(70000);

			TraineeEmp t = new TraineeEmp();
			t.setName("Ajay");
			t.setSalary(67000);
			t.setPerformance("Excellent");

			session.persist(p);
			session.persist(e);
			session.persist(t);
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
