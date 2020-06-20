package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApp {

	public static void main(String[] args) throws Exception{
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		try {
			Emp e=new Emp(123, "Raju", "Hyderabad", 89000);
			Emp e1=new Emp(124, "Salman", "Hyderabad", 99000);
			session.persist(e);
			session.persist(e1);
						
			tx.commit();
			//session.clear();
			session.evict(e);
			
			Emp e2=session.get(Emp.class, 123);
			System.out.println(e2);
			
		} catch (Exception e) {
			System.out.println("Something is wrong "+e.getMessage());
			tx.rollback();
		}finally {
			session.close();
			sf.close();
		}

	}

}
