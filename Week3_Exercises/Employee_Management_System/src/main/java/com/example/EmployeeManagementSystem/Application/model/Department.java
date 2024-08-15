package com.example.employeemanagementsystem.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
