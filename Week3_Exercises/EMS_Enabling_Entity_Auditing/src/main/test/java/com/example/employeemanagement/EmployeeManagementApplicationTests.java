package com.example.employeemanagement;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.DepartmentRepository;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class EmployeeManagementApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    private LocalDateTime now;

    @BeforeEach
    void setUp() {
        now = LocalDateTime.now();
    }

    @Test
    void testEmployeeCreation() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setPosition("Software Engineer");

        Employee savedEmployee = employeeRepository.save(employee);

        assertNotNull(savedEmployee.getId());
        assertNotNull(savedEmployee.getCreatedDate());
        assertNotNull(savedEmployee.getLastModifiedDate());
        assertTrue(savedEmployee.getCreatedDate().isAfter(now) || savedEmployee.getCreatedDate().isEqual(now));
        assertTrue(savedEmployee.getLastModifiedDate().isAfter(now) || savedEmployee.getLastModifiedDate().isEqual(now));
    }

    @Test
    void testDepartmentCreation() {
        Department department = new Department();
        department.setName("Engineering");

        Department savedDepartment = departmentRepository.save(department);

        assertNotNull(savedDepartment.getId());
        assertNotNull(savedDepartment.getCreatedDate());
        assertNotNull(savedDepartment.getLastModifiedDate());
        assertTrue(savedDepartment.getCreatedDate().isAfter(now) || savedDepartment.getCreatedDate().isEqual(now));
        assertTrue(savedDepartment.getLastModifiedDate().isAfter(now) || savedDepartment.getLastModifiedDate().isEqual(now));
    }

    @Test
    void testEmployeeUpdate() {
        Employee employee = new Employee();
        employee.setName("Jane Doe");
        employee.setPosition("Data Scientist");

        Employee savedEmployee = employeeRepository.save(employee);

        // Modify employee
        savedEmployee.setPosition("Senior Data Scientist");
        Employee updatedEmployee = employeeRepository.save(savedEmployee);

        assertNotNull(updatedEmployee.getLastModifiedDate());
        assertTrue(updatedEmployee.getLastModifiedDate().isAfter(savedEmployee.getCreatedDate()));
    }

    @Test
    void testDepartmentUpdate() {
        Department department = new Department();
        department.setName("Marketing");

        Department savedDepartment = departmentRepository.save(department);

        // Modify department
        savedDepartment.setName("Sales");
        Department updatedDepartment = departmentRepository.save(savedDepartment);

        assertNotNull(updatedDepartment.getLastModifiedDate());
        assertTrue(updatedDepartment.getLastModifiedDate().isAfter(savedDepartment.getCreatedDate()));
    }
}
