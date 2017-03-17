package com.codecool.spring.repository;

import com.codecool.spring.model.EduClass;
import com.codecool.spring.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ani on 2017.03.13..
 */
//@Import(RestApplication.class)
@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.HSQL)
public class EduClassRepositoryTest {
    @Autowired
    private EduClassRepository reposotory;

    @Test
    public void first() throws Exception {
        Student studentAni = new Student("Ani");
        Student studentEde = new Student("Ede");
        EduClass klass = new EduClass("bp1");
        Set<Student> students = new HashSet<>();
        students.add(studentAni);
        students.add(studentEde);
        klass.setStudent(students);

        reposotory.save(klass);

        List<EduClass> klassList = reposotory.findAll();
        EduClass klassFromDb = klassList.get(0);
        assertNotNull(klassFromDb);
        assertEquals("bp1", klassFromDb.getName());

    }
}