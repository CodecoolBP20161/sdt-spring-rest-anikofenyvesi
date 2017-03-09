package com.codecool.spring.repository;

import com.codecool.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// As type, we must use <Model object, Id's type>
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
