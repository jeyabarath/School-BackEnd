package com.jeyabarath.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.jeyabarath.app.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
