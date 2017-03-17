package com.codecool.spring.repository;

import com.codecool.spring.model.EduClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ani on 2017.03.13..
 */
@Repository
public interface EduClassRepository  extends JpaRepository<EduClass, Integer> {
}
