package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> getEmployeesByDepartment(String department, Pageable pageable) {
        return employeeRepository.findByDepartment(department, pageable);
    }

    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    public Page<Employee> getEmployeesWithSalaryGreaterThan(Double salary, Pageable pageable) {
        return employeeRepository.findBySalaryGreaterThan(salary, pageable);
    }
}
