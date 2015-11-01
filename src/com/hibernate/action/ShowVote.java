package com.hibernate.action;

import com.hibernate.impl.AdminImpl;
import com.hibernate.vo.Category;
import com.hibernate.vo.Optionlist;
import com.hibernate.vo.Vote;
import com.opensymphony.xwork2.Action;

public class ShowVote implements Action{
	private String categoryid;
	private Category categoroy;
	private AdminImpl adminimpl;
	

	public Category getCategoroy() {
		return categoroy;
	}


	public void setCategoroy(Category categoroy) {
		this.categoroy = categoroy;
	}


	public String getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		adminimpl = new AdminImpl();
		categoroy = adminimpl.findcategory(Integer.parseInt(categoryid));	
		
		return "success";
	}

}
