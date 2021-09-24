package com.elite.StudentAssesment.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elite.StudentAssesment.entity.Student;
import com.elite.StudentAssesment.service.StudentService;


@RestController
@RequestMapping(value="/student/api")
public class StudentRestController {

	    @Autowired
	    private StudentService studentService;
	    
	    
	    @PostMapping(value="/create")
	    public String createStudent(@RequestBody Student student) {
	    	
	    	return studentService.addStudent(student);
	    	
	    	
	    }
		
		
	    @GetMapping(value="/getallstudent")
	    public List<Student> getAllStudentList(){
	    	return studentService.getAllStudent();
	    	
	    }
	    
	    @DeleteMapping(value="/deletestudent/{id}")
	    public String deleteStudentById(@PathVariable("id") Integer id) {
	    	
	    	return studentService.deleteStudent(id);
	    	
	    }
		
	    @PutMapping(value="/updatestudent")
	    public String updateTicket(@RequestBody Student student) {
	    	
	    	return studentService.updateStudent(student);
	    }

	
	
	
}
