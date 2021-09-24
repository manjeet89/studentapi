package com.elite.StudentAssesment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Column(name="student_no")
    @Id
	private int studentNo;
	
    @Column(name="student_name")
    private String studentName;
	
    @Column(name="student_dob")
    private Date studentDateOfBirth;
	
    @Column(name="student_doj")
    private Date studentDateOfJoining;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(Date studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	public Date getStudentDateOfJoining() {
		return studentDateOfJoining;
	}

	public void setStudentDateOfJoining(Date studentDateOfJoining) {
		this.studentDateOfJoining = studentDateOfJoining;
	}
	
    
    
	
}
