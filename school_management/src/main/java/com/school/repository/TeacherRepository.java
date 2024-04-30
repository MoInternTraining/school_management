package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM teacher WHERE teacher_id = :id")
	public Teacher find(@Param("id")int id);
}
