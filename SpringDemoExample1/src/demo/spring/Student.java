package demo.spring;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private String name,branch;
	private int age;
	public Student(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Hello GoodMorning "+name+"\nStudent [name=" + name + ", branch=" + branch + ", age=" + age + "]";
	}
	
	
	
}
