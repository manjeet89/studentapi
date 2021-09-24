package com.elite.StudentAssesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.StudentAssesment.entity.Student;
import com.elite.StudentAssesment.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	
	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
		return "add Student Successfully";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
		return "update student Successfully";
	}

	@Override
	public String deleteStudent(int studentNo) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentNo);
		return "delete student Successfully";
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

}
