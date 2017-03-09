package com.codecool.spring.controller;

import com.codecool.spring.model.Student;
import com.codecool.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// all endpoints will come under this root
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Student findAll(@PathVariable Integer id){
        return studentRepository.findOne(id);
    }

    // we will map to POST,PUT /students/ and /students/1
    @RequestMapping(value = { "/", "/{id}" }, method = { RequestMethod.POST, RequestMethod.PUT })
    public Student crateOrUpdate(@RequestBody Student student){
        // save by default creates a new resource or updates the existing one - while returning the updated entity.
        return studentRepository.save(student);
    }

}
