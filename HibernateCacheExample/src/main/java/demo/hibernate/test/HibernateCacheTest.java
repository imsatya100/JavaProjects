package demo.hibernate.test;

import org.hibernate.Session;

import demo.hibernate.Employee;
import demo.hibernate.MySession;

public class HibernateCacheTest {
	public static void main(String[] args) throws Exception {
		Session session = MySession.getSession();
		System.out.println("=======Employee Details========");
		System.out.println("Eid\tName\tSalary");
		Employee e1 = session.get(Employee.class, "1111");
		System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
		Employee e2 = session.get(Employee.class, "2222");
		System.out.println(e2.getId()+"\t"+e2.getName()+"\t"+e2.getSalary());
		Employee e3 = session.get(Employee.class, "3333");
		System.out.println(e3.getId()+"\t"+e3.getName()+"\t"+e3.getSalary());
		Employee e4 = session.get(Employee.class, "4444");
		System.out.println(e4.getId()+"\t"+e4.getName()+"\t"+e4.getSalary());
		
		
	}
}
