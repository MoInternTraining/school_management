package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.PersonInfo;

@Repository
public interface PersonInfoRepository extends JpaRepository<PersonInfo, Integer> {
	
}
