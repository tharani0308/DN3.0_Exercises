package com.example.employeemanagementsystem.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String position;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
