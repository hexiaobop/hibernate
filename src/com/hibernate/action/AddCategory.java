package com.hibernate.action;

import com.hibernate.impl.AdminImpl;
import com.hibernate.vo.Category;
import com.opensymphony.xwork2.Action;

public class AddCategory implements Action{
private String category;
private AdminImpl adminimpl;
	

	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Category categ = new Category();
		categ.setCategoryname(category);
		System.out.println("------------------"+category);
		adminimpl =new AdminImpl();
		adminimpl.addCategory(categ);
        return SUCCESS;
	}

}
