package com.elite.StudentAssesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.elite.StudentAssesment.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
