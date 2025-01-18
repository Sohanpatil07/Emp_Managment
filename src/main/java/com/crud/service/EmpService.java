package com.crud.service;

import com.crud.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {

    public Employee adEmployees(Employee emp);
    public Employee getEmployeesById(String id);
    public List<Employee> getEmployees();
    public Employee updateEmployee(Employee emp);
    public void deleteEmployeeById(String id);

}
