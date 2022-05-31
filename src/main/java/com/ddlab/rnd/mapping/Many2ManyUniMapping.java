package com.ddlab.rnd.mapping;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.uni.Student;
import com.ddlab.rnd.entity.uni.Teacher;
import com.ddlab.rnd.service.Many2ManyUniService;

@Component
public class Many2ManyUniMapping {
	
	@Autowired
	private Many2ManyUniService service;
	
	public void save() {
		
		Set<Teacher> scienceTeachers = new HashSet<Teacher>();
//		Set<Teacher> howToPlayGuitarAuthor = new HashSet<Teacher>();

		Teacher teacher1 = new Teacher();
		teacher1.setName("Trevor Page");
//		howToProgramWithJavaAuthor.add(author);

		Teacher teacher2 = new Teacher();
		teacher2.setName("John Doe");

		scienceTeachers.add(teacher1);
		scienceTeachers.add(teacher2);
//		howToPlayGuitarAuthor.add(author2);

		Student stud1 = new Student();
		stud1.setName("John Abraham");

		Student stud2 = new Student();
		stud2.setName("Vidya Balan");

		Student stud3 = new Student();
		stud3.setName("Madhuri Dixit");

//		book.setTeachers(howToProgramWithJavaAuthor);
		stud1.setTeachers(scienceTeachers);
		stud2.setTeachers(scienceTeachers);
		stud3.setTeachers(scienceTeachers);
		
		Set<Student> students = new HashSet<>();
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		
		service.saveAllStudentUnidirectionally(students);
		
//		service.saveStudentUnidirectionally(stud2);
//		service.saveStudentUnidirectionally(stud3);


	}
}
