package com.crud.service;

import com.crud.entity.Employee;
import com.crud.repository.Emp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class Emp_Service implements EmpService{
    @Autowired
    private final Emp_Repository empRepository;

    public Emp_Service(Emp_Repository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public Employee adEmployees(Employee emp) {
        return empRepository.save(emp);
    }

    @Override
    public Employee getEmployeesById(String id) {
        Employee idNotFound = empRepository.findById(id).orElseThrow(() -> new NullPointerException("id not found"));
        return idNotFound;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> all = empRepository.findAll();
        return all;
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        emp.setName(emp.getName());
        emp.setEmail(emp.getEmail());
        emp.setAddress(emp.getAddress());
        return empRepository.save(emp);
    }

    @Override
    public void deleteEmployeeById(String id) {
        empRepository.deleteById(id);

    }

    
    
}
