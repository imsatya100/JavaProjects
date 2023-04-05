package demo.spring;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pid,name,gender;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	private void init() {
		System.out.println("Bean Object is Intilizing...\n");
	}
	private void destroy() {
		System.out.println("Bean Object will Destroy...\n");
	}
}
