package com.hibernate.action;

import java.util.List;

import com.hibernate.dao.CommonDao;
import com.hibernate.impl.CommonImpl;
import com.hibernate.vo.Category;
import com.opensymphony.xwork2.Action;

public class Admin implements Action{
	private List<Category> categorylist;
	private CommonDao commondao;
	

	public List<Category> getCategorylist() {
		return categorylist;
	}


	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		categorylist = new CommonImpl().findcategory();
		for(Category c:categorylist)
		{
			System.out.println(c.getCategoryname());
		}
		
		return "success";
	}

}
