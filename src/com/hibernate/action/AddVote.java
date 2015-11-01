package com.hibernate.action;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.hibernate.impl.AdminImpl;
import com.hibernate.vo.Category;
import com.hibernate.vo.Optionlist;
import com.hibernate.vo.Vote;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class AddVote implements Action {
	private String select;
	private String votename;
	AdminImpl adminImpl = new AdminImpl();

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getVotename() {
		return votename;
	}

	public void setVotename(String votename) {
		this.votename = votename;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Vote vote = new Vote();
		vote.setVotename(votename);
		vote.setDate(new Date());
		System.out.println(select);
		System.out.println("长度为："+select.length());
		Category cate = adminImpl.findcategory(Integer.parseInt(select.trim()));
		vote.setCategory(cate);

		
		ActionContext context = ActionContext.getContext();
		Set<Optionlist> set = new HashSet<Optionlist>();
		System.out.println("------------------------");
		Map params = context.getParameters();

		int opn = 1;
		for (Object i : params.keySet()) {

			String s = "optionlist" + String.valueOf(opn);
			System.out.println(i);
			if (((String) i).equals(s)) {
				Optionlist optionlist = new Optionlist();
				String bookName2[] = (String[]) params.get(s);
				System.out.println(bookName2[0]);
				optionlist.setOptionname(bookName2[0]);
				System.out.println("遍历+++++++++++++++++++++++++++++++");

				set.add(optionlist);

				
				opn = opn + 1;
			} else {
				;
			}

		}
		vote.setSetoption(set);
		adminImpl.addvote(vote);
		return SUCCESS;
	}

}
