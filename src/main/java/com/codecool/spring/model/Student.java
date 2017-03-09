package com.codecool.spring.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// needed to handle as an entity
@Entity
// mark the referenced table
@Table(name = "students")
@Data
public class Student {

    // it is mandatory to mark the unique identifier column
    @Id
    private Integer id;

    private String name;

    // Column is needed if the variable name is different of the column name
    // or is some special config is needed.
    @Column(name = "class")
    private String cls;

}
