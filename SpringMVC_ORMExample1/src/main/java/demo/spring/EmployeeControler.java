package demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeControler {
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView showForm() {
	        return new ModelAndView("addEmployee", "emp", new Employee());
	}

	@RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	public String submit(@ModelAttribute("emp")Employee emp,
	       Model model) {
		    
		if(emp==null) {
	        	return "error";
	        }
	        model.addAttribute("id", emp.getId());
        
	        model.addAttribute("name", emp.getName());
	        model.addAttribute("salary", emp.getSalary());
	        return "success";
	}
}
