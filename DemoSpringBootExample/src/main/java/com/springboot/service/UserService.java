package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;
@Service
public class UserService {
	 	@Autowired
	    private UserRepository userRepository;
	 
	    // Save operation
	    public User saveUser(User user)
	    {
	        return userRepository.save(user);
	    }
	 
	    // Read operation
	    public List<User> fetchUserList()
	    {
	        return (List<User>)userRepository.findAll();
	    }
	    
	    public Page<User> listAll(int pageNum) {
	        int pageSize = pageNum;
	         
	        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
	         
	        return userRepository.findAll(pageable);
	    }
}
