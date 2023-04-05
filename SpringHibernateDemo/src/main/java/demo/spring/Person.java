package demo.spring;

public class Person {
	private String pid,name,gender,mailidl;
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
	public String getMailidl() {
		return mailidl;
	}
	public void setMailidl(String mailidl) {
		this.mailidl = mailidl;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", mailidl=" + mailidl + ", age=" + age
				+ "]";
	}
	
	
}
