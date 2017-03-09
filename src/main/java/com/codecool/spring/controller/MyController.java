package com.codecool.spring.controller;

import com.codecool.spring.model.Model;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// includes ResponseBody - for converting objects to JSON or XML.
@RestController
public class MyController {

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Model sayHelloXML(){
        Model m = new Model();
        m.setValue("Hello");
        return m;
    }

    @RequestMapping(value = "/xml/{name}", produces = MediaType.APPLICATION_XML_VALUE)
    public Model sayHelloXML2(@PathVariable("name") String name){
        Model m = new Model();
        m.setValue("Hello " + name);
        return m;
    }

    @RequestMapping(value = "/json")
    public Model sayHelloJson(){
        Model m = new Model();
        m.setValue("Hello");
        return m;
    }

    @RequestMapping(value = "/json/{name}")
    public Model sayHelloJSON2(@PathVariable("name") String name){
        Model m = new Model();
        m.setValue("Hello " + name);
        return m;
    }
}
