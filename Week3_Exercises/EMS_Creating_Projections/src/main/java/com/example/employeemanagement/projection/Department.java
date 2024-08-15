package com.example.employeemanagement.projection;

import java.time.LocalDateTime;

public class DepartmentInfo {
    
    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    
    public DepartmentInfo(Long id, String name, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    // Getters and Setters
}
