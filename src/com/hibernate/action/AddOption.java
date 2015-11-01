package com.hibernate.action;

import com.hibernate.dao.UserDao;
import com.hibernate.impl.UserImpl;
import com.opensymphony.xwork2.Action;

public class AddOption implements Action{
private int optionlist;
private UserDao userDao;
private int categoryid = 3;

	public int getCategoryid() {
	return categoryid;
}

public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}

	public int getOptionlist() {
	return optionlist;
}

public void setOptionlist(int optionlist) {
	this.optionlist = optionlist;
}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		userDao = new UserImpl();
		userDao.addoption(optionlist);
		return "success";
	}
	

}
