package com.hibernate.action;

import java.util.List;

import com.hibernate.impl.CommonImpl;
import com.hibernate.vo.Category;
import com.opensymphony.xwork2.Action;

public class UserScan implements Action{
	private List<Category> categorylist;
	

	public List<Category> getCategorylist() {
		return categorylist;
	}


	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		CommonImpl comm = new CommonImpl();
		categorylist = comm.findcategory();		
		return "success";
	}

}
