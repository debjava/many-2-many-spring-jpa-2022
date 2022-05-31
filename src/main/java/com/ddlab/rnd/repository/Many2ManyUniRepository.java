package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.uni.Student;

@Repository
public interface Many2ManyUniRepository extends CrudRepository<Student, Long> {

}
