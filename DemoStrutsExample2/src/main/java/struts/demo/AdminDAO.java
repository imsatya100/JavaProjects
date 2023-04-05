package struts.demo;

import org.hibernate.Session;

public class AdminDAO {
	public static Admin check(Admin admin){
		Session ses = DBSession.createSession();
		Admin adm=null;
		try{
			adm=(Admin)ses.get(Admin.class, admin.getUname());
			System.out.println("Correct Username And Password");
		}catch(Exception e){
			System.out.println("Wrong USername And Password");
		}
		if(adm!=null && admin.getPwd().equals(adm.getPwd())){
			return adm;
		}
		else{
			return null;
		}
	}
}
