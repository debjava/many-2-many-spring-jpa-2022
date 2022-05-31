package com.ddlab.rnd.entity.bi;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Teacher_b")
@Table(name = "teacher_m2mb")
@Getter
@Setter
public class Teacher {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(mappedBy="teachers")
    private Set<Student> students = new HashSet<Student>();

}
