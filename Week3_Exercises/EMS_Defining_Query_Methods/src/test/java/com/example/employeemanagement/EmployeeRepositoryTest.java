package com.example.employeemanagement;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByDepartment() {
        List<Employee> itEmployees = employeeRepository.findByDepartment("IT");
        assertEquals(2, itEmployees.size());
    }

    @Test
    public void testFindEmployeesWithSalaryGreaterThan() {
        List<Employee> highSalaryEmployees = employeeRepository.findEmployeesWithSalaryGreaterThan(55000.0);
        assertEquals(3, highSalaryEmployees.size());
    }
}
