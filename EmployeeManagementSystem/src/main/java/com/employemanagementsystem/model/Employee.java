package com.employemanagementsystem.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    private int employeeId;

    private String role;

    private String employeeFirstName;

    private String employeeLastName;

    private String emailId;

    private String password;

    private double salary;

    private String address;

    @ManyToOne
  //  @JsonManagedReference
    @JoinColumn(name="deptId")
    private Department department;

    @ManyToMany
    @JoinColumn(name="projectId")
    private Set<Project> project;

}
