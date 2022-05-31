package com.ddlab.rnd.mapping;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.bi.Student;
import com.ddlab.rnd.entity.bi.Teacher;
import com.ddlab.rnd.service.Many2ManyBidService;

@Component
public class Many2ManyBidMapping {
	
	@Autowired
	private Many2ManyBidService service;
	
	public void save() {
		Set<Teacher> teachers = new HashSet<>();
		
		Teacher t1 = new Teacher();
		t1.setName("John Abraham");
		
		Teacher t2 = new Teacher();
		t2.setName("Vidya Balan");
		
		teachers.add(t1);
		teachers.add(t2);
		
		Set<Student> students = new HashSet<>();
		
		Student s1 = new Student();
		s1.setName("Hati");
		
		Student s2 = new Student();
		s2.setName("Ghoda");
		
		students.add(s1);
		students.add(s2);
		
		t1.getStudents().add(s1);
		t2.getStudents().add(s2);
		
		s1.getTeachers().add(t1);
		s2.getTeachers().add(t2);
		
		service.saveAllStudents(students);
	}
}
