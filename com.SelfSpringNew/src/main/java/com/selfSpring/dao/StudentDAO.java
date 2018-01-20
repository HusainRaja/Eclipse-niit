package com.selfSpring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;


import com.selfSpring.models.Student;

public class StudentDAO {
    
    private SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Transactional
	public void registerStudent(Student st) {
		sessionFactory.getCurrentSession().saveOrUpdate(st);
    }
	@Transactional
	public List<Student> showAllStudents(){
		List<Student> stList=sessionFactory.getCurrentSession().createCriteria(Student.class).list();
		return stList;
	}
}
