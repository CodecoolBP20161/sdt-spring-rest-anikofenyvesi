package com.codecool.spring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ani on 2017-03-11.
 */
@Entity
@Data
public class Mentor {
    @Id
    private Integer id;

    private String name;

}
