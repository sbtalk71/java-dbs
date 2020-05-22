package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.hibernate.Emp;

public class NativeQuery {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		try {
			//Query query=session.createNativeQuery("delete from myemp where empno between 113 and 116");
			
			//query.;
			
			Query query=session.createNativeQuery("select e.empno,e.name,e.address,e.salary from myemp e");
			
			List<Object[]> data=query.getResultList();
			
			for(Object[] d:data) {
				String name=(String)d[1];
				Double salary=(Double)d[3];
				System.out.println(name+" "+salary);
			}
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
			sf.close();
		}
	}

}
