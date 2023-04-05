package demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;



@Controller
public class PersonController {
	@Autowired
	private PersonDAO pdao;
	
	@RequestMapping(value="/perForm",method = RequestMethod.GET)    
	public String perform(Model m){    
	     m.addAttribute("command", new Person());  
	     return "AddPerson";   
    }    
	
	@RequestMapping(value="/addPer",method = RequestMethod.POST)    
    public String addPer(@ModelAttribute("per") Person per){    
		pdao.addPerson(per);
        return "redirect:/viewPerson";//will redirect to viewemp request mapping    
    }
	
	@RequestMapping(value="/viewPerson" ,method = RequestMethod.GET)    
    public String viewPerson(Model m){    
        List<Person> list=pdao.getAllPersonDetails();   
        m.addAttribute("list",list);  
        //System.out.println(list);
        return "ViewPersons";    
    }    
	
	
	@Bean
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/viewPages/");
        bean.setSuffix(".jsp");
        return bean;
    }
	
}
