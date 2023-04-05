package demo.struts;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class PersonBean extends ActionSupport implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pid,name,gender,mailid;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PersonBean [pid=" + pid + ", name=" + name + ", gender=" + gender + ", mailid=" + mailid + ", age="
				+ age + "]";
	}
	public String execute(){
		Integer status = PersonDAO.savePerson(this);
		if(status>0)
		return SUCCESS;
		else return INPUT;
	}
	
}
