package struts.demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Admin implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String uname,pwd;
	private String name;
	private int age;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Admin [uname=" + uname + ", pwd=" + pwd + ", name=" + name + ", age=" + age + "]";
	}
	
}
