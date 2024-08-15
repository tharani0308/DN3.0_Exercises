package com.example.employeemanagement.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {
    
    @Value("#{target.id}")
    Long getId();
    
    @Value("#{target.name}")
    String getName();
    
    @Value("#{target.position}")
    String getPosition();
    
    @Value("#{target.createdDate}")
    String getCreatedDate();
    
    @Value("#{target.lastModifiedDate}")
    String getLastModifiedDate();
}
