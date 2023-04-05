package demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsExample2 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private UserBean user;
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public String execute() {
		return SUCCESS;
	}
}
