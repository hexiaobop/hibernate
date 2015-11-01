package com.hibernate.vo;

import java.util.Date;
import java.util.Set;

public class Vote {
	private int voteid;
	private String votename;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private Category category;
	private Set<Optionlist> setoption;
	public int getVoteid() {
		return voteid;
	}
	public void setVoteid(int voteid) {
		this.voteid = voteid;
	}
	
	public String getVotename() {
		return votename;
	}
	public void setVotename(String votename) {
		this.votename = votename;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Set<Optionlist> getSetoption() {
		return setoption;
	}
	public void setSetoption(Set<Optionlist> setoption) {
		this.setoption = setoption;
	}
	

}
