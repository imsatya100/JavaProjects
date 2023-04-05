package demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsExample3 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String uname,pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	public String execute() {
		if(uname.equalsIgnoreCase("SATYA") && pwd.equalsIgnoreCase("SATYA")) {
			return SUCCESS;
		}
		else {
			this.addActionError("Wrong Username Or Password");
			return ERROR;
		}
	}//execute()
	
	
	public void validate() {
		if(uname.length()==0 || uname.equals("")) {
			this.addFieldError("uname", "Enter User Name");
		}//unameValidateion
		
		if(pwd.length()==0 || pwd.equals("")) {
			this.addFieldError("pwd", "Enter Password");
		}
		
	}//validate()
}
