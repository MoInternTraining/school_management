package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
//	@Query(nativeQuery = true, value = "Select grade_id from grade where grade_id=:grade_id")
//	public int findGradeID(@Param("grade_id") int grade_id);
	
}
