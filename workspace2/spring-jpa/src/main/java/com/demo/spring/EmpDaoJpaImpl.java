package com.demo.spring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.EmpDao;

@Repository
@Transactional
public class EmpDaoJpaImpl implements EmpDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public String save(Emp e) {
		try {
			em.persist(e);
			return "success";
		} catch (DataIntegrityViolationException ex) {
			return "Save Failed" + ex.getMessage();
		}
	}

	@Override
	public Emp findById(int empId) {
		Emp e = em.find(Emp.class, empId);
		try {
			if (e == null) {

				throw new RuntimeException("Emp Not Found..");
			}
		} catch (RuntimeException e2) {
			throw e2;
		}
		return e;
	}

	@Override
	public List<Emp> findAll() {
		Query query=em.createQuery("select e from Emp e");
		
		return query.getResultList();
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

}
