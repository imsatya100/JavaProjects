package demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeControl {

	public static void main(String[] args){  
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		 EmployeeDAO empDAO = (EmployeeDAO) context.getBean("employeeDaoBean");  
		 List<Employee> employee = empDAO.getAllEmployees(); 
		 System.out.println("========Employee Detaiils========");
		 System.out.println("ID\t Name\tSalary");
		 employee.forEach(emp->{
			 System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
		 });         
		  
		((ClassPathXmlApplicationContext)context).close(); 
		 
		 
	}  

}
