package com.codecool.spring.controller;

import com.codecool.spring.model.Mentor;
import com.codecool.spring.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ani on 2017-03-11.
 */
@RestController
@RequestMapping("/ani/mentors")
public class MentorController {

    @Autowired
    private MentorRepository mentorRepository;

    @RequestMapping("/")
    public List<Mentor> findAll(){
        return mentorRepository.findAllByOrderByName();
    }

    @RequestMapping("/{id}")
    public Mentor findById(@PathVariable Integer id) {
        return mentorRepository.findOne(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public Mentor add(@PathVariable Integer id, @RequestBody Mentor input) {
        return mentorRepository.save(input);
    }


}
