package com.codecool.spring.model;

import lombok.Data;

import javax.persistence.*;

// needed to handle as an entity
@Entity
// mark the referenced table
@Table(name = "students")
@Data
public class Student {
    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    // it is mandatory to mark the unique identifier column
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // Column is needed if the variable name is different of the column name
    // or is some special config is needed.
    @JoinColumn(name="class_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EduClass eduClass;

}
