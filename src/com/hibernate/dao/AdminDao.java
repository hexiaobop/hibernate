package com.hibernate.dao;

import com.hibernate.vo.Category;
import com.hibernate.vo.Vote;

public interface AdminDao {
	public void addCategory(Category cate) throws Exception;
	public void addvote(Vote vote);
	public Category findcategory(int categoryid);
	

}
