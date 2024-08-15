package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(Double salary) {
        return employeeRepository.findEmployeesWithSalaryGreaterThan(salary);
    }
}
