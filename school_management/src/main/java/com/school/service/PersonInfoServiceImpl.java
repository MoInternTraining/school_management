package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.PersonInfo;
import com.school.repository.PersonInfoRepository;

import antlr.collections.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class PersonInfoServiceImpl implements PersonInfoService {
	@Autowired
	private PersonInfoRepository personInfoRepository;
	
	public void keepPersonInfo(PersonInfo personInfo) {
		this.personInfoRepository.saveAndFlush(personInfo);
	}
	
	
}
