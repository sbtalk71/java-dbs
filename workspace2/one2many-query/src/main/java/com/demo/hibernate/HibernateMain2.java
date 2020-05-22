package com.demo.hibernate;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			
			Emp e1=new Emp(114, "Ashish", "Bangalore", 90000);
			Emp e2=new Emp(115, "Sanjay", "Bangalore", 80000);
			
			Dept dept = session.load(Dept.class, 30);
			
			dept.getEmps().add(e1);
			dept.getEmps().add(e2);
			
			session.saveOrUpdate(dept);
			
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
