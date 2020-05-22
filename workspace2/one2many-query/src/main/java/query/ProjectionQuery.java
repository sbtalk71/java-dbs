package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.hibernate.Emp;

public class ProjectionQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Query query = session.createQuery("select e.empName,e.salary from Emp e where e.empName like 'Sh%'");

			List<Object[]> empList = query.getResultList();

			for (Object[] o : empList) {
				String name = (String) o[0];
				Double sal = (Double) o[1];
				System.out.println(name + " " + sal);
			}

			Query query1 = session.createQuery("select new query.Data(e.empName,e.salary) from Emp e where e.empName like 'Sh%'");

			List<Data> empList1 = query1.getResultList();

			for (Data d : empList1) {
				
				System.out.println(d);
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
