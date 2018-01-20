package com.selfSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.selfSpring.dao.StudentDAO;
import com.selfSpring.models.Student;

public class StudentService {
    @Autowired
    StudentDAO sdao;
    
    public StudentDAO getSdao() {
		return sdao;
	}

	public void setSdao(StudentDAO sdao) {
		this.sdao = sdao;
	}

	public void registerStudent(Student st) {
    	sdao.registerStudent(st);
    }
	public List<Student> showAllStudents(){
		return sdao.showAllStudents();
	}
}
