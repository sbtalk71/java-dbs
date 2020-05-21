package com.demo.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Course;
import com.demo.hibernate.Student;

public class HibernateApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			
			Course c1=new Course();
			c1.setCourseId(1007);
			c1.setCourseName("Chemistry");
			
			Course c2=new Course();
			c2.setCourseId(1008);
			c2.setCourseName("English");
			
			session.persist(c1);
			session.persist(c2);
			
			Student s1=new Student();
			s1.setStudentName("Ankith");
			s1.getCourses().add(c1);
			
			Student s2=new Student();
			s2.setStudentName("Pankaj");
			s2.getCourses().add(c2);
			s2.getCourses().add(c1);
			
			Student s3=new Student();
			s3.setStudentName("Rupesh");
			s3.getCourses().add(c2);
			s3.getCourses().add(c1);
			
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
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
