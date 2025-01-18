package com.crud.service;

import com.crud.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    public Employee adEmployees(Employee emp);
    public Employee getEmployeesById(Long id);
    public Employee getEmployees();
    public Employee updateEmployee(Employee emp);
    public void deleteEmployeeById(Long id);

}
