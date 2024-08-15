package com.example.ems;

import com.example.ems.model.Employee;
import com.example.ems.service.EmployeeService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeeServiceTest {

    @Test
    public void testAddEmployee() {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setPosition("Developer");
        employeeService.addEmployee(employee);
    }

    @Test
    public void testBatchInsert() {
        EmployeeService employeeService = new EmployeeService();
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setPosition("Manager");

        Employee employee2 = new Employee();
        employee2.setName("Bob");
        employee2.setPosition("Analyst");

        employeeService.addEmployeesInBatch(Arrays.asList(employee1, employee2));
    }
}
