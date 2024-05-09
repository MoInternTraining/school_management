package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.model.Classroom;
import com.school.model.Student;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM classroom WHERE classroom_id = :id")
	public Classroom findClassroom(@Param("id") int id);
	

}
