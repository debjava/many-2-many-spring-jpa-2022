package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.bi.Student;

@Repository
public interface Many2ManyBidRepository extends CrudRepository<Student, Long>{

}
