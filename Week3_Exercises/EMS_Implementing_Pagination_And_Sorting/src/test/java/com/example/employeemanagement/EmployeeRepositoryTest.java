package com.example.employeemanagement;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByDepartment() {
        Page<Employee> page = employeeRepository.findByDepartment("IT", PageRequest.of(0, 10));
        assertEquals(2, page.getContent().size());
    }

    @Test
    public void testFindAllWithPagination() {
        Page<Employee> page = employeeRepository.findAll(PageRequest.of(0, 2));
        assertEquals(2, page.getContent().size()); // Adjust according to your data
    }

    @Test
    public void testFindBySalaryGreaterThan() {
        Page<Employee> page = employeeRepository.findBySalaryGreaterThan(55000.0, PageRequest.of(0, 10));
        assertEquals(3, page.getContent().size()); // Adjust according to your data
    }
}
