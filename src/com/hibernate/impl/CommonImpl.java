package com.hibernate.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionfactory.HibernateSessionFactory;
import com.hibernate.action.Admin;
import com.hibernate.dao.CommonDao;
import com.hibernate.vo.Category;
import com.hibernate.vo.Optionlist;
import com.hibernate.vo.Vote;

public class CommonImpl implements CommonDao {

	@Override
	public List<Category> findcategory() {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateSessionFactory
				.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = session.beginTransaction();
		String hql = "from Category";// 使用命名参数，推荐使用，易读。
		Query query = session.createQuery(hql);
		List<Category> list = query.list();
		for(Category c:list)
		{
//			for(Vote v:c.getSetvote())
//			{
//				System.out.println(v.getVotename());
//				for(Optionlist o:v.getSetoption())
//				{
//					System.out.println(o.getOptionname());
//				}
//			}
			System.out.println();
		}
		
		trans.commit();
		session.close();
		sessionfactory.close();
		return list;

	}

}
