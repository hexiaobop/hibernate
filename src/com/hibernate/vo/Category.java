package com.hibernate.vo;

import java.util.Set;

public class Category {
	private int categoryid;
	private String categoryname;
	private Set<Vote> setvote; 
	
	public Set<Vote> getSetvote() {
		return setvote;
	}
	public void setSetvote(Set<Vote> setvote) {
		this.setvote = setvote;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	

}
