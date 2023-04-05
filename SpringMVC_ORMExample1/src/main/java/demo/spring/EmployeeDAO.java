package demo.spring;

import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class EmployeeDAO {
	JpaTemplate template;  
	  
    public void setTemplate(JpaTemplate template) {  
        this.template = template;  
    } 
    
    //addEmployee
    public void addEmployee(Employee employee){  
        template.persist(employee);  
    } 
    
    //updateSalary
    public void updatesalary(Employee employee){  
        if(employee != null){  
        	 template.persist(employee);   
        }  
    }  
    
    //deleteEmployee
    public void deleteEmployee( Employee employee){  
        if(employee != null) {
        	 template.remove(employee); 
        }
            
    }  
   
    
    //readEmployees
    @SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees(){  
        List<Employee> employees =template.find("Select * from Employee");  
        return employees;  
    }  
}  

