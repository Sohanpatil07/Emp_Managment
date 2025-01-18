package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeesById(@PathVariable String id){
        return ResponseEntity.ok(empService.getEmployeesById(id));
    }
    @GetMapping("/allEmployees")
    public ResponseEntity<List<Employee>> getEmployees(@RequestBody Employee employee) {
        return ResponseEntity.ok(empService.getEmployees());
    }
    @PutMapping("/updateEmployees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(empService.updateEmployee(employee));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable String id) {
        empService.deleteEmployeeById(id);
        return ResponseEntity.ok().build();
    }


}
