package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.projection.EmployeeProjection;
import com.example.employeemanagement.projection.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    @Query("SELECT e FROM Employee e WHERE e.position = ?1")
    List<EmployeeProjection> findEmployeesByPosition(String position);
    
    @Query("SELECT new com.example.employeemanagement.projection.EmployeeInfo(e.id, e.name, e.position, e.createdDate, e.lastModifiedDate) FROM Employee e WHERE e.position = ?1")
    List<EmployeeInfo> findEmployeeInfoByPosition(String position);
}
