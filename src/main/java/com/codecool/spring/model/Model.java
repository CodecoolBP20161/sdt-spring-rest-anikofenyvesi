package com.codecool.spring.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Model {

    @XmlAttribute
    private String value;

}
