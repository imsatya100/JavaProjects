package demo.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		EmployeeDAO empdao = (EmployeeDAO) context.getBean("empdao");
		List<Employee> empList = null;
		
		
		Employee e = new Employee();
		e.setId(1111);
		empList=empdao.getEmployeeById(e);
		for(Employee emp:empList){
			System.out.println(emp);
		}
		//empList = empdao.getEmployees();
		Iterator<Employee> itr = empList.iterator();
		System.out.println("ID\tNAME\t\tSALARY");
		System.out.println("===========================================");
		while(itr.hasNext()){
			Employee em = itr.next();
			System.out.println(em.getId()+"\t"+em.getName()+"\t"+em.getSal());
		}
		
		
		
		
		/*Employee e = new Employee();
		e.setId(4444);
		e.setName("Ranit Behera");
		e.setSal(18000);
		
		if(empdao.saveEmployee(e)!=null){
			System.out.println("Data Saved Successfull...");
		}else{
			System.out.println("Data Saving Failed...");
		}*/
	}

}
