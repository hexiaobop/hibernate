package com.hibernate.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionfactory.HibernateSessionFactory;
import com.hibernate.dao.UserDao;
import com.hibernate.vo.Category;
import com.hibernate.vo.Optionlist;

public class UserImpl implements UserDao {

	@Override
	public void addoption(int optionid) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateSessionFactory
				.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = session.beginTransaction();
		Optionlist optionlis = (Optionlist) session.get(Optionlist.class, optionid);
		optionlis.setNumber(optionlis.getNumber()+1);
		session.save(optionlis);
		trans.commit();
		session.close();
		sessionfactory.close();
		
	}

}
