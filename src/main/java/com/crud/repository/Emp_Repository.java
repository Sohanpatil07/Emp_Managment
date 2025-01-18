package com.crud.repository;

import com.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emp_Repository extends JpaRepository<Long, Employee> {

}
