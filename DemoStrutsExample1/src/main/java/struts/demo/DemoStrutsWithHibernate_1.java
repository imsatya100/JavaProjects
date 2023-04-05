package struts.demo;

import com.opensymphony.xwork2.ActionSupport;

public class DemoStrutsWithHibernate_1 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String execute(){
		if(RegisterDAO.registerPerson(person)){
			return SUCCESS;
		}
		
		return ERROR;
		
	}
}
