package com.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeService;
@Controller
public class EmployeeControllerDemo
{
	// Annotation
    @Autowired 
    private EmployeeService employeeService;
   
    @GetMapping("/")
    public String welcome(ModelMap model)
    {
//    	ModelAndView modelAndView = null;
//    	modelAndView = new ModelAndView("home","employee",new Employee());
//    	return modelAndView;    	
    	
    	model.put("employee",new Employee());
    	
    	return "index";
    }
    // Save operation
    @GetMapping("/showForm")
    public ModelAndView showForm()
    {
    	ModelAndView modelAndView = null;
    	modelAndView = new ModelAndView("AddEmployee","employee",new Employee());
    	return modelAndView; 
    	
    	
    	
//    	return "AddEmployee";
    }
    
    // Save operation
    @PostMapping("/addEmployee")
    public String saveEmployee(
         @ModelAttribute("employee") Employee employee)
    {
    	employeeService.saveEmployee(employee);
        return "redirect:/viewEmployees";
    }
 
    // Read operation
    @GetMapping("/viewEmployees")
    public String fetchEmployeeList(Model model)
    {
    	List<Employee> employees = employeeService.fetchEmployeeList();
    	model.addAttribute("employees", employees);
        return "ViewEmployees";
    }
 
    // Update operation
    @GetMapping("/updateEmployee")
    @ResponseBody
    public Employee updateEmployee(@ModelAttribute("employee") Employee employee)
    {
    	Employee employe = employeeService.findById(employee.getId());
        return employe;
    }
    	
    
    
    
    
    // Delete operation
    @GetMapping("/deleteEmployee")
    public String deleteEmployeeById(@ModelAttribute("employee") Employee employee)
    {
        employeeService.deleteEmployeeById(
            employee.getId());
        return "redirect:/viewEmployees";
    }
    
    // Delete operation
    @GetMapping("/deleteEmployee/{id}")
    @ResponseBody
    public String deleteEmployeeById(@PathVariable("id") String id)
    {
        employeeService.deleteEmployeeById(id);
        return "redirect:/viewEmployees";
    }
}
