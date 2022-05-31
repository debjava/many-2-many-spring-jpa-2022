package com.ddlab.rnd.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.uni.Student;
import com.ddlab.rnd.repository.Many2ManyUniRepository;
import com.ddlab.rnd.service.Many2ManyUniService;

@Service
public class Many2ManyUniServiceImpl implements Many2ManyUniService {
	
	@Autowired
	private Many2ManyUniRepository uniRepo;

	@Override
	public void saveStudentUnidirectionally(Student student) {
		uniRepo.save(student);
	}

	@Override
	public void saveAllStudentUnidirectionally(Set<Student> students) {
		uniRepo.saveAll(students);
	}
	
}
