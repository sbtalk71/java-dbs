package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApp2 {

	public static void main(String[] args) throws Exception{
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		try {
			
			Emp e=new Emp(126, "Atul", "Delhi", 90000);
			Education edu=new Education("B.Tech", "JNTU", "Hyderabad");
			e.setEducation(edu);
			
			session.persist(e);
			tx.commit();
		} catch (Exception e) {
			System.out.println("Something is wrong "+e.getMessage());
			tx.rollback();
		}finally {
			session.close();
			sf.close();
		}

	}

}
