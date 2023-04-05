package struts.demo;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class DemoStrutsExample4 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<String> genders;
	
	private String gender,correct;
	
	
	public List<String> getGenders() {
		return genders;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}

	private static final String MALE="MALE";
	private static final String FEMALE="FEMALE";
	private static final String UNKNOWN="UNKNOWN";
	public DemoStrutsExample4() {
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(UNKNOWN);
		
	}
	public String getDefaultGender(){
		return UNKNOWN;
	}
	
	public String execute(){
		return SUCCESS;
	}
	
	public String display(){
		return NONE;
	}
}
