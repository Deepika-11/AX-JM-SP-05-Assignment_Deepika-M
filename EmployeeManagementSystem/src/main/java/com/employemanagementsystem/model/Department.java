package com.employemanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString

@Entity
@Table(name = "department_table")
public class Department {

    @Id
    private int departmentId;

    private String departmentName;

    private String collegeName;

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "department")
    @JsonBackReference
    private Set<Employee> employee;

}
