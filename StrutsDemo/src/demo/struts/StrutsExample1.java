package demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsExample1 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String fname,lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String execute() {
		return SUCCESS;
	}
	
	
	
	
}
