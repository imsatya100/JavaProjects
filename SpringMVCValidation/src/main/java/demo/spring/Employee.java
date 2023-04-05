package demo.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	@NotNull
	@Size(min=3,message="required")
	private String name;
	//Custom annotation  
	@Password
    @NotNull
	@Size(min=3,message="required")
	private String password;
	
    //Predefined annotation  
    @Min(value=18, message="must be equal or greater than 18")
	@Max(value=60, message="must be equal or less than 60")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
