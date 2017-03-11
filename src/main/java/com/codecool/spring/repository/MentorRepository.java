package com.codecool.spring.repository;

import com.codecool.spring.model.Mentor;
import com.codecool.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ani on 2017-03-11.
 */
public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    List<Mentor> findAllByOrderByName();
}
