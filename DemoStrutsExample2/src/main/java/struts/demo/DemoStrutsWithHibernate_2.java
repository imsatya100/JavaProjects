package struts.demo;

import com.opensymphony.xwork2.ActionSupport;

public class DemoStrutsWithHibernate_2 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Admin admin;
	
	
	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public String execute(){
		admin=AdminDAO.check(admin);
		if(admin!=null){
			return SUCCESS;
		}
		else return ERROR;
	}
}
