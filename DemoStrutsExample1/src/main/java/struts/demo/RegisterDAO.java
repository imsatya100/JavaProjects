package struts.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegisterDAO {
	public static boolean registerPerson(Person person){
		Session ses = DBSession.createSession();
		Transaction tx = ses.beginTransaction();
		boolean flag=false;
		try{
			ses.persist(person);
			tx.commit();
			flag=true;
			System.out.println("Person Registered Succesfull");
		}catch(Exception e){
			System.out.println("Person Registration Failed");
			tx.rollback();
		}
		return flag;
	}
}
