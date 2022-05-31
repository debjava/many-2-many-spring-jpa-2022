package com.ddlab.rnd.service;

import java.util.Set;

import com.ddlab.rnd.entity.uni.Student;

public interface Many2ManyUniService {
	
	void saveStudentUnidirectionally(Student student);
	
	void saveAllStudentUnidirectionally(Set<Student> students);
}
