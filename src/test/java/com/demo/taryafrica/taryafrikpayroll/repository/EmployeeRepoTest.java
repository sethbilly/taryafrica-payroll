package com.demo.taryafrica.taryafrikpayroll.repository;

import java.util.Optional;

import com.demo.taryafrica.taryafrikpayroll.model.Employee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
public class EmployeeRepoTest {
    
    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void testCreateReadDelete() {
        Employee employee = new Employee("Test Employee", "Admin", "test@taryafrica.com");

        employeeRepository.save(employee);

        //test read

        Optional<Employee> readEmployee = employeeRepository.findById(employee.getId());
        Assertions.assertThat(readEmployee.isPresent()).isTrue();

        //test delete
        employeeRepository.deleteAll();
        Assertions.assertThat(employeeRepository.findAll()).isEmpty();
    }
}
