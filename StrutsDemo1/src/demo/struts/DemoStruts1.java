package demo.struts;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DemoStruts1 extends ActionSupport{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute() {
		if(name==null) {
			return ERROR;
		}
		else {
			return SUCCESS;
		}
		
		
	}
}
