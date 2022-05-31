package com.ddlab.rnd.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.bi.Student;
import com.ddlab.rnd.repository.Many2ManyBidRepository;
import com.ddlab.rnd.service.Many2ManyBidService;

@Service
public class Many2ManyBidServiceImpl implements Many2ManyBidService {

	@Autowired
	private Many2ManyBidRepository repo;
	
	@Override
	public void saveAllStudents(Set<Student> students) {
		repo.saveAll(students);
	}

}
