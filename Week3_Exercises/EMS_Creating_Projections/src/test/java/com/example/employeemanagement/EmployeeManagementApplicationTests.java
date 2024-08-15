package com.example.employeemanagement;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.projection.DepartmentInfo;
import com.example.employeemanagement.projection.EmployeeInfo;
import com.example.employeemanagement.repository.DepartmentRepository;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
    void testEmployeeProjection() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setPosition("Software Engineer");

        Employee savedEmployee = employeeRepository.save(employee);

        // Fetch by projection
        var projections = employeeRepository.findEmployeesByPosition("Software Engineer");

        assertTrue(projections.stream().anyMatch(e -> e.getId().equals(savedEmployee.getId())));
    }

    @Test
    void testEmployeeInfoProjection() {
        Employee employee = new Employee();
        employee.setName("Jane Doe");
        employee.setPosition("Product Manager");
        employee.setCreatedDate(now);
        employee.setLastModifiedDate(now);

        employeeRepository.save(employee);

        var employeeInfos = employeeRepository.findEmployeeInfoByPosition("Product Manager");

        assertTrue(employeeInfos.stream().anyMatch(e -> e.getName().equals("Jane Doe")));
    }

    @Test
    void testDepartmentProjection() {
        Department department = new Department();
        department.setName("IT");

        Department savedDepartment = departmentRepository.save(department);

        // Fetch by projection
        var projections = departmentRepository.findDepartmentsByNameContaining("IT");

        assertTrue(projections.stream().anyMatch(d -> d.getId().equals(savedDepartment.getId())));
    }

    @Test
    void testDepartmentInfoProjection() {
        Department department = new Department();
        department.setName("HR");
        department.setCreatedDate(now);
        department.setLastModifiedDate(now);

        departmentRepository.save(department);

        var departmentInfos = departmentRepository.findDepartmentInfoByNameContaining("HR");

        assertTrue(departmentInfos.stream().anyMatch(d -> d.getName().equals("HR")));
    }
}
