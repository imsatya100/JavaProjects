package demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonTest {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDAO pdao = (PersonDAO) context.getBean("pdao");
		
	List<?> persons=pdao.getAllPerson();
	for(Object o:persons){
		System.out.println(o);
			
	}
	((ClassPathXmlApplicationContext)context).close();
	}

}
