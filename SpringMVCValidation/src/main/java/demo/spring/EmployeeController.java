package demo.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		
		return new ModelAndView("ViewPage", "emp", new Employee());
	}
	@RequestMapping("/addEmployee")
	public String validate(@Valid@ModelAttribute("emp") Employee emp,BindingResult br) {
		if(br.hasErrors()) {
			return "ViewPage";
		}
		else {
			return "EmployeeDetails";
		}
	}
	
}
