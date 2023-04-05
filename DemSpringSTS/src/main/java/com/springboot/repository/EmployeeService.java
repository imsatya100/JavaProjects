package com.springboot.repository;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
 
    // Save operation
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
 
    // Read operation
    public List<Employee> fetchEmployeeList()
    {
        return (List<Employee>)
            employeeRepository.findAll();
    }
    
    //findById operation
    public Employee findById(String id)
    {
        return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id :" + id));
    }
 
    // Update operation
    public Employee updateEmployee(Employee employee)
    {
        Employee empDB = employeeRepository.findById(employee.getId()).get();
 
        if (Objects.nonNull(employee.getName())&& !"".equalsIgnoreCase(
                employee.getName())) {
            empDB.setName(
                employee.getName());
        }
 
        if (Objects.nonNull(employee.getSalary())) {
            empDB.setSalary(
                employee.getSalary());
        }
 
        return employeeRepository.save(empDB);
    }
 
    // Delete operation
    public void deleteEmployeeById(String employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }
}
