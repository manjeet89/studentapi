package com.elite.StudentAssesment.service;

import java.util.List;

import com.elite.StudentAssesment.entity.Student;

public interface StudentService {
	
	
	public String addStudent(Student student);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(int studentNo);
	
	public List<Student> getAllStudent();

}
