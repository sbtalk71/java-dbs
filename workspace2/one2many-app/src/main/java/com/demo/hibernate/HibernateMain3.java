package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			
			Emp e1=new Emp(116, "Tapas", "Bangalore", 90000);
			Emp e2=new Emp(117, "Billu", "Bangalore", 80000);
			
			Dept dept = session.load(Dept.class, 30);
			
			e1.setDept(dept);
			e2.setDept(dept);
			
			session.persist(e1);
			session.persist(e2);
			
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
