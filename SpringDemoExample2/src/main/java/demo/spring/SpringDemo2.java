package demo.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person person = (Person) context.getBean("person");
		
		System.out.println(person+"\n");
		
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
