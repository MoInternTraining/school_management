package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer>{

}
