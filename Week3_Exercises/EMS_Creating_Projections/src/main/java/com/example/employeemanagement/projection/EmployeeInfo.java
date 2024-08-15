package com.example.employeemanagement.projection;

import java.time.LocalDateTime;

public class EmployeeInfo {
    
    private Long id;
    private String name;
    private String position;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    
    public EmployeeInfo(Long id, String name, String position, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    // Getters and Setters
}
