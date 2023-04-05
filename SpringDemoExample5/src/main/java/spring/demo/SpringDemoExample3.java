package spring.demo;

import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoExample3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PersonDAO pdao = (PersonDAO) context.getBean("personDAO");
		
		/*
		 *Deleting Person Details by id
		*/
		/*Person p = new Person();
		p.setPid("2222");
		int k=pdao.deletePerson(p);
		if(k>0){
			System.out.println("Successful... ");
		}
		else System.out.println("Error... ");
		*/
		
		
		/*
		 *Retrieving All Person Details
		*/
		
		List<Person> li = pdao.getAllPersonDetails();
		ListIterator<Person> litr = li.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		
		
		/*Retrieving Single Person Details
		 * 
		 * 
		Person p = new Person();
		p.setPid("1111");
		Person p1 = pdao.getPersonById(p);
		System.out.println(p1);
		*/
		
		/*Adding Persons
		 * 
		 * Person p1 = new Person();
		p1.setPid("2222");
		p1.setName("Sarthak Padhi");
		p1.setAge(23);
		p1.setGender("Male");
		p1.setMailid("padhi1999@gmail.com");
		
		int k=pdao.addPerson(p1);
		if(k>0){
			k=0;
			Person p2 = new Person();
			p2.setPid("3333");
			p2.setName("Lipun Padhi");
			p2.setAge(23);
			p2.setGender("Male");
			p2.setMailid("padhi2789@gmail.com");
			k=pdao.addPerson(p2);
			if(k>0){
				System.out.println("Successful...");
			}
			else System.out.println("2nd Person Error");
		}
		else System.out.println("1st Person Error");	
		*/
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
