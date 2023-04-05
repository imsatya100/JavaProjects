package demo.struts;

import java.io.Serializable;


import com.opensymphony.xwork2.ActionSupport;

public class Person extends ActionSupport implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pid,name,gender,mailid;
	private String age;
	public Person(){
		
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", mailid=" + mailid + ", age=" + age
				+ "]";
	}
	
	public String execute(){
		
		Integer status = MySession.save(this);
		if(status>0){
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	
	
}
















