package com.demo.taryafrica.taryafrikpayroll.repository;

import com.demo.taryafrica.taryafrikpayroll.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
    
}
