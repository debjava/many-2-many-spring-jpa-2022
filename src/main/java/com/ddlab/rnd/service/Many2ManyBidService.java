package com.ddlab.rnd.service;

import java.util.Set;

import com.ddlab.rnd.entity.bi.Student;

public interface Many2ManyBidService {
	
	void saveAllStudents(Set<Student> students);

}
