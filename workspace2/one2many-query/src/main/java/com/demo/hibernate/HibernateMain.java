package com.demo.hibernate;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			
			Dept dept=session.get(Dept.class, 10);
			
			Set<Emp> emps=dept.getEmps();
			for(Emp e:emps) {
				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary());
			}

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
