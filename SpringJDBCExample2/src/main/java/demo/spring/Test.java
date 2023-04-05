package demo.spring;


import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static Logger log = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {
		log.info("This is a Information Message");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO empdao = (EmployeeDAO) context.getBean("empdao");
		
		Employee e = new Employee();
		e.setId(4444);
		e.setSal(21000);
		int i=empdao.updateEmployee(e);
		if(i>0)System.out.println("Employe Details Updated Successfull");
		((ClassPathXmlApplicationContext)context).close();
	}

}
