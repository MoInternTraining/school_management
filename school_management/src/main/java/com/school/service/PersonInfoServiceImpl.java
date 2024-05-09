package com.school.service;

import java.util.Optional;

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
//	@Override
//	public void updateOrCreatePersonInfo(PersonInfo personInfo) {
//		Optional<PersonInfo> opPersonInfo = personInfoRepository.findById(personInfo.getPersonId());
//		PersonInfo per = null;
//		if (opPersonInfo.isEmpty()) {
//			this.personInfoRepository.save(personInfo);
//		}
//		else {
//			per = opPersonInfo.get();
//			per.setName(personInfo.getName());
//			per.set
//		}
//	}

}
