package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by department id
    List<Employee> findByDepartmentId(Long departmentId);

    // Find employee by email
    Employee findByEmail(String email);
}
