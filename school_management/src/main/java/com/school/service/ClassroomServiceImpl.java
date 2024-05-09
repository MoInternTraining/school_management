package com.school.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Classroom;
import com.school.model.Student;
import com.school.repository.ClassroomRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClassroomServiceImpl implements ClassroomService {
	@Autowired
	private ClassroomRepository classroomRepository;

	@Override
	public void keepClassroomName(Classroom classroom) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Classroom find(int id) {
		Classroom classroom = this.classroomRepository.findClassroom(id);
	    return classroom;
	}


}
