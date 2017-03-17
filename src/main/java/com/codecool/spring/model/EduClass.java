package com.codecool.spring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ani on 2017.03.13..
 */
@Entity
@Data
public class EduClass {
    public EduClass(String name) {
        this.name = name;
    }

    public EduClass() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "eduClass", fetch = FetchType.LAZY)
    private Set<Student> student;

}
