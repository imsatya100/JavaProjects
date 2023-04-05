package com.springboot.controller;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.model.User;
import com.springboot.service.UserService;
@Controller
public class UserController{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private static final List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String showForm(Model model) {
		LOGGER.trace("for tracing purpose");
		LOGGER.debug("for debugging purpose");
		LOGGER.info("for informational purpose");
		LOGGER.warn("for warning purpose");
		LOGGER.error("for logging errors");
		
	    
	    
	     User user = new User();
	    model.addAttribute("user", user);
	    model.addAttribute("professionList", professionList);
	    return "register_form";
	}
	
	//@RequestMapping(path = "/register", method =RequestMethod.POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute User user, @RequestPart("image") MultipartFile multipartFile,
 BindingResult result,Model model) {
		//MultipartFile multipartFile = (MultipartFile) user.getImage();
		if(result.hasErrors() || multipartFile.isEmpty() || multipartFile==null ) {
			
	    	model.addAttribute("professionList", professionList);
	    	
	    	return "register_form";
	    }
		
		
		  String fileName = multipartFile.getOriginalFilename();
		  user.setFileName(fileName);
		  userService.saveUser(user);
		
		  String uploadDir = "user-file/" + user.getFileName(); 
		  try {
			  byte[] bytes = multipartFile.getBytes(); 
			  Path path = Paths.get(uploadDir); 
			  Files.write(path,bytes);
			  
		  }catch(Exception e) { 
			  e.printStackTrace(); 
		  	}
		 
        System.out.println(user);
	     
	    return "redirect:/get_user";
	}
	@GetMapping("/get_user")
	public String getUser(Model model) {
	    
	    List<User> userList = userService.fetchUserList();
	    model.addAttribute("totalPages", 5);
	     model.addAttribute("userList", userList);
	    return "register_success";
	}
	@GetMapping("/{pageNum}")
	public String viewPage(Model model,
	        @PathVariable(name = "pageNum") int pageNum) {
	     
		Page<User> page = userService.listAll(pageNum);
	     
	    List<User> userList = page.getContent();
	     
	    model.addAttribute("currentPage", pageNum);
	    model.addAttribute("totalPages", page.getTotalPages());
	    model.addAttribute("totalItems", page.getTotalElements());
	    model.addAttribute("userList", userList);
	     
	    return "register_success";
	}

	
}
