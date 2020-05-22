package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.demo.hibernate.Emp;

public class CriteriaDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		try {
			
			//Criteria query=session.createCriteria(Emp.class);
			Criteria query=session.createCriteria(Emp.class).add(Restrictions.between("salary",25000.0, 90000.0));
			
			List<Emp> empList=query.list();
			for(Emp e: empList) {
				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "
			+e.getSalary()+""+e.getDept().getDeptName());
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
