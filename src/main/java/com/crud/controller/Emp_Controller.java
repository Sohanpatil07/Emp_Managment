package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/emp")
public class Emp_Controller {
    // CRUD operations for employee entity go here.
    private final EmpService empService;

    public Emp_Controller(EmpService empService) {
        this.empService = empService;
    }
    @PostMapping("/addEmployees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(empService.adEmployees(employee));
    }



}
