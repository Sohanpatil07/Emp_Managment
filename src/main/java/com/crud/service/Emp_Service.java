package com.crud.service;

import com.crud.entity.Employee;
import com.crud.repository.Emp_Repository;
import org.springframework.stereotype.Service;

@Service
public class Emp_Service implements EmpService{
    
    private final Emp_Repository empRepository;

    public Emp_Service(Emp_Repository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public Employee adEmployees(Employee emp) {
        return empRepository.save(emp);

    }

    @Override
    public Employee getEmployeesById(Long id) {
        return null;
    }

    @Override
    public Employee getEmployees() {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    
    
}
