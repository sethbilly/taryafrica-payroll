package com.demo.taryafrica.taryafrikpayroll.controller;

import java.util.Arrays;
import java.util.List;
import com.demo.taryafrica.taryafrikpayroll.api.EmployeeController;
import com.demo.taryafrica.taryafrikpayroll.model.Employee;
import com.demo.taryafrica.taryafrikpayroll.repository.EmployeeRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    EmployeeRepository employeeRepository;

    @Test
    public void testfindAll() throws Exception {
      Employee employee = new Employee("Test1 Employee", "Administrator", "test1.employee@taryafrica.com");
      List<Employee> employees = Arrays.asList(employee);
   
      Mockito.when(employeeRepository.findAll()).thenReturn(employees);
   
      mockMvc.perform(get("/api/v1/employees"))
          .andExpect(status().isOk())
          .andExpect(jsonPath("$", Matchers.hasSize(1)))
          .andExpect(jsonPath("$[0].name", Matchers.is("Test1 Employee")));
    }
    
}
