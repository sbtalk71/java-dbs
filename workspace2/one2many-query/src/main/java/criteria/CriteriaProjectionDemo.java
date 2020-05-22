package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.demo.hibernate.Emp;

public class CriteriaProjectionDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		try {
			
			//Criteria query=session.createCriteria(Emp.class);
			Criteria query=session.createCriteria(Emp.class)
								.setProjection(Projections.projectionList()
										.add(Projections.property("empId"))
										.add(Projections.property("empName"))
										.add(Projections.property("salary"))
										);
			
//			List<Emp> empList=query.list();
//			for(Emp e: empList) {
//				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "
//			+e.getSalary()+""+e.getDept().getDeptName());
//			}
			
			List<Object[]> empList = query.list();

			for (Object[] o : empList) {
				Integer id=(Integer)o[0];
				String name = (String) o[1];
				Double sal = (Double) o[2];
				System.out.println(id+" "+name + " " + sal);
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
