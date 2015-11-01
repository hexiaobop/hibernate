package com.hibernate.vo;

public class Optionlist {
	private int optionid;
	private String optionname;
	private int number;
	private Vote vote;
	public int getOptionid() {
		return optionid;
	}
	public void setOptionid(int optionid) {
		this.optionid = optionid;
	}
	public String getOptionname() {
		return optionname;
	}
	public void setOptionname(String optionname) {
		this.optionname = optionname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	
	

}
