package com.hibernate.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionfactory.HibernateSessionFactory;
import com.hibernate.dao.AdminDao;
import com.hibernate.vo.Category;
import com.hibernate.vo.Optionlist;
import com.hibernate.vo.Vote;

public class AdminImpl implements AdminDao {

	@Override
	public void addvote(Vote vote) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateSessionFactory
				.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(vote);
		System.out.println("+++++++++++++"+vote.getVotename());
		for(Optionlist op:vote.getSetoption())
		{
			session.save(op);
		}
		trans.commit();
		session.close();
		sessionfactory.close();
	}

	@Override
	public void addCategory(Category cate) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateSessionFactory
				.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(cate);
		trans.commit();
		session.close();
		sessionfactory.close();

	}

	@Override
	public Category findcategory(int categoryid) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateSessionFactory
				.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = session.beginTransaction();
		String hql = "from Category as category where category.categoryid=:categoryid";// 使用命名参数，推荐使用，易读。
		Query query = session.createQuery(hql);
		query.setInteger("categoryid", categoryid);

		List<Category> list = query.list();
		Category cate = list.get(0);
		for(Vote v:cate.getSetvote())
		{
			for(Optionlist o:v.getSetoption())
			{
				;
			}
		}
		System.out.println("查询到一个cate"+cate.getCategoryname());
		trans.commit();
		session.close();
		sessionfactory.close();
		return cate;
	}

}
