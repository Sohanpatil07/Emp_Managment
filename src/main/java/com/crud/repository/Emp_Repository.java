package com.crud.repository;

import com.crud.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emp_Repository extends MongoRepository<Employee, String> {

}
