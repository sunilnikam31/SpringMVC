package com.sunil.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunil.daoI.IDao;
import com.sunil.model.Admin;
import com.sunil.model.Registration;

@Repository
public class DaoImpl implements IDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public List<Registration> insertRegister(Registration r) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(r);
		List<Registration> list=getAllData();
		tx.commit();
		session.close();
		return list;
	}

	@Override
	public Registration editRegister(int rollno) {

		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query<Registration> query=session.createQuery("from Registration where rollno="+rollno+"");
		Registration r1=query.getSingleResult();
		tx.commit();
		session.close();
		return r1;
	}

	@Override
	public List<Registration> updateRegister(Registration r) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query<Registration> query=session.createQuery("update Registration set name='"+r.getName()+"',address='"+r.getAddress()+"',mobile='"+r.getMobile()+"',email='"+r.getEmail()+"',password='"+r.getPassword()+"' where rollno="+r.getRollno()+"");
		query.executeUpdate();
		List<Registration> list=getAllData();
		tx.commit();
		session.close();
		return list;
	}

	@Override
	public List<Registration> deleteRegister(int rollno) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query<Registration> query=session.createQuery("delete from Registration where rollno="+rollno+"");
		query.executeUpdate();
		List<Registration> list=getAllData();
		tx.commit();
		session.close();
		return list;
	}

	@Override
	public List<Registration> getData(Admin r) {
		
		Session session=sf.openSession();
		if(r.getEmail().equals("admin") && r.getPassword().equals("admin"))
		{
			Query<Registration> query=session.createQuery("from Registration");
			List<Registration> list=query.getResultList();
			return list;
		}
		session.close();
		return null;
	}

	@Override
	public List<Registration> getAllData() {
		Session session=sf.openSession();
		Query<Registration> query=session.createQuery("from Registration");
		List<Registration> list=query.getResultList();
		session.close();
		return list;
	}
}
